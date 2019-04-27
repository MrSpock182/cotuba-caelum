package cotuba.pdf;

import java.nio.file.Files;
import java.util.List;

import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.IBlockElement;
import com.itextpdf.layout.element.IElement;
import com.itextpdf.layout.property.AreaBreakType;
import cotuba.domain.Capitulo;
import cotuba.domain.Ebook;

public class GeradorPDF {

    public void gera(Ebook ebook) {
        List<Capitulo> capitulos = ebook.getCapitulos();

        try (PdfWriter writer = new PdfWriter(Files.newOutputStream(ebook.getArquivoSaida()));
             PdfDocument pdf = new PdfDocument(writer);
             Document pdfDocument = new Document(pdf)) {

            for (Capitulo capitulo : capitulos) {
                String conteudoHtml = capitulo.getConteudoHtml();
                List<IElement> iElements = HtmlConverter.convertToElements(conteudoHtml);

                for (IElement element : iElements) {
                    pdfDocument.add((IBlockElement) element);
                }
                // TODO: não adicionar página depois do último capítulo
                pdfDocument.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao criar arquivo PDF: " + ebook.getArquivoSaida().toAbsolutePath(), ex);
        }

    }

}
