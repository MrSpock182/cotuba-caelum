package cotuba.domain.builder;

import cotuba.domain.Capitulo;
import cotuba.domain.Ebook;
import cotuba.domain.FormatoEbook;

import java.nio.file.Path;
import java.util.List;

public class EbookBuilder {

    private String titulo;
    private Path arquivoSaida;
    private List<Capitulo> capitulos;
    private FormatoEbook formatoEbook;

    public EbookBuilder comTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public EbookBuilder comArquivoSaida(Path arquivoSaida) {
        this.arquivoSaida = arquivoSaida;
        return this;
    }

    public EbookBuilder comCapitulos(List<Capitulo> capitulos) {
        this.capitulos = capitulos;
        return this;
    }

    public EbookBuilder comFormatoEbook(FormatoEbook formatoEbook) {
        this.formatoEbook = formatoEbook;
        return this;
    }

    public Ebook constroi() {
        return new Ebook(this.titulo, this.arquivoSaida, this.formatoEbook, this.capitulos);
    }
}
