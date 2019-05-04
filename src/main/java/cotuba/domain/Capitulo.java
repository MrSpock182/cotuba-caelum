package cotuba.domain;

import cotuba.plugin.ICapitulo;

public class Capitulo implements ICapitulo {

    private String titulo;
    private String conteudoHtml;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudoHtml() {
        return conteudoHtml;
    }

    public void setConteudoHtml(String conteudoHtml) {
        this.conteudoHtml = conteudoHtml;
    }
}
