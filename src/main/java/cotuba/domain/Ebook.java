package cotuba.domain;

import java.nio.file.Path;
import java.util.List;

public class Ebook {
    private String titulo;
    private Path arquivoSaida;
    private List<Capitulo> capitulos;
    private FormatoEbook formatoEbook;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public FormatoEbook getFormatoEbook() {
        return formatoEbook;
    }

    public void setFormatoEbook(FormatoEbook formatoEbook) {
        this.formatoEbook = formatoEbook;
    }

    public Path getArquivoSaida() {
        return arquivoSaida;
    }

    public void setArquivoSaida(Path arquivoSaida) {
        this.arquivoSaida = arquivoSaida;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(List<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }
}
