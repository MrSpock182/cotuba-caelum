package cotuba.application;

import java.nio.file.Path;

public interface ParametrosEntradaCotuba {
    Path getDiretorioDosMD();
    String getFormato();
    Path getArquivoDeSaida();
}
