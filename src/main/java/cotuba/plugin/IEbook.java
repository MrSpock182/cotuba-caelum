package cotuba.plugin;

import cotuba.domain.FormatoEbook;

import java.nio.file.Path;
import java.util.List;

public interface IEbook {
    String getTitulo();
    Path getArquivoSaida();
    List<? extends ICapitulo> getCapitulos();
    FormatoEbook getFormatoEbook();
}
