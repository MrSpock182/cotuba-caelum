package cotuba.application;

import cotuba.domain.Ebook;

public interface GeradorEbook {
    void gera(Ebook ebook);

    static GeradorEbook cria(Ebook ebook) {
        return ebook.getFormatoEbook().getGeradorEbook();
    }

}
