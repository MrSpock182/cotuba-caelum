package cotuba.application;

import cotuba.domain.Capitulo;
import cotuba.md.RenderizadorMdHTMLComCommonMark;

import java.nio.file.Path;
import java.util.List;

public interface RenderizadorMdHTML {
    List<Capitulo> renderiza(Path diretorioDosMD);

    static RenderizadorMdHTML cria() {
        return new RenderizadorMdHTMLComCommonMark();
    }
}
