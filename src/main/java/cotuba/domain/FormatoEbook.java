package cotuba.domain;

import cotuba.application.GeradorEbook;
import cotuba.epub.GeradorEPUBComEpublib;
import cotuba.pdf.GeradorPDFComIText;

public enum FormatoEbook {
    PDF(new GeradorPDFComIText()),
    EPUB(new GeradorEPUBComEpublib());

    private GeradorEbook geradorEbook;

    FormatoEbook(GeradorEbook geradorEbook) {
        this.geradorEbook = geradorEbook;
    }

    public GeradorEbook getGeradorEbook() {
        return geradorEbook;
    }
}
