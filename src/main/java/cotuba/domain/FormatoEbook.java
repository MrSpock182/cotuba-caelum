package cotuba.domain;

import cotuba.application.GeradorEbook;
import cotuba.epub.GeradorEPUBComEpubLib;
import cotuba.pdf.GeradorPDFComIText;

public enum FormatoEbook {
    PDF(new GeradorPDFComIText()),
    EPUB(new GeradorEPUBComEpubLib());

    private GeradorEbook geradorEbook;

    FormatoEbook(GeradorEbook geradorEbook) {
        this.geradorEbook = geradorEbook;
    }

    public GeradorEbook getGeradorEbook() {
        return geradorEbook;
    }
}
