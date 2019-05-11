package cotuba.domain;

import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public final class Ebook {

    private String titulo;
    private final Path arquivoSaida;
    private final List<Capitulo> capitulos;
    private final FormatoEbook formatoEbook;

    public Ebook(Path arquivoSaida, FormatoEbook formatoEbook, List<Capitulo> capitulos) {
        this.arquivoSaida = arquivoSaida;
        this.capitulos = Collections.unmodifiableList(capitulos);
        this.formatoEbook = formatoEbook;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public FormatoEbook getFormatoEbook() {
        return formatoEbook;
    }

    public Path getArquivoSaida() {
        return arquivoSaida;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

}
