package cotuba.domain.builder;

import cotuba.domain.Capitulo;

public class CapituloBuilder {
    private String titulo;
    private String html;

    public CapituloBuilder comTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public CapituloBuilder comHtml(String html) {
        this.html = html;
        return this;
    }

    public Capitulo constroi() {
        return new Capitulo(this.titulo, this.html);
    }

}
