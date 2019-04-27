package cotuba.application;

import cotuba.domain.Ebook;
import cotuba.domain.Capitulo;
import cotuba.epub.GeradorEPUB;
import cotuba.md.RenderizadorMdHtml;
import cotuba.pdf.GeradorPDF;

import java.nio.file.Path;
import java.util.List;

public class Cotuba {

    public void executa(String formato, Path diretorioDosMD, Path arquivoDeSaida) {
        RenderizadorMdHtml renderizadorMdHtml = new RenderizadorMdHtml();
        List<Capitulo> capitulos = renderizadorMdHtml.renderiza(diretorioDosMD);

        Ebook ebook = new Ebook();
        ebook.setFormato(formato);
        ebook.setArquivoSaida(arquivoDeSaida);
        ebook.setCapitulos(capitulos);

        if("pdf".equals(formato)) {
            GeradorPDF geradorPDF = new GeradorPDF();
            geradorPDF.gera(ebook);
        } else if("epub".equals(formato)) {
            GeradorEPUB geradorEPUB = new GeradorEPUB();
            geradorEPUB.gera(ebook);
        } else {
            throw new RuntimeException("Formato de ebook invalido: " + formato);
        }

    }

}
