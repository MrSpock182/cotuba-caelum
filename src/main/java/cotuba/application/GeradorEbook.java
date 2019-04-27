package cotuba.application;

import cotuba.domain.Ebook;
import cotuba.epub.GeradorEPUBComEpublib;
import cotuba.pdf.GeradorPDFComIText;

public interface GeradorEbook {
    void gera(Ebook ebook);

    static GeradorEbook cria(String formato) {
        if("pdf".equals(formato)) {
            return new GeradorPDFComIText();
        } else if("epub".equals(formato)) {
            return new GeradorEPUBComEpublib();
        } else {
            throw new RuntimeException("Formato de ebook invalido: " + formato);
        }
    }

}
