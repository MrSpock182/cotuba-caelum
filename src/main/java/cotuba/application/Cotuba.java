package cotuba.application;

import cotuba.domain.Capitulo;
import cotuba.domain.Ebook;
import cotuba.plugin.PluginAcaoAposGeracao;

import java.nio.file.Path;
import java.util.List;

public class Cotuba {

    public void executa(ParametrosEntradaCotuba parametros) {
        Path arquivoDeSaida = parametros.getArquivoDeSaida();

        RenderizadorMdHTML renderizadorMdHtml = RenderizadorMdHTML.cria();
        List<Capitulo> capitulos = renderizadorMdHtml.renderiza(parametros.getDiretorioDosMD());

        Ebook ebook = new Ebook();
        ebook.setFormatoEbook(parametros.getFormato());
        ebook.setArquivoSaida(arquivoDeSaida);
        ebook.setCapitulos(capitulos);

        GeradorEbook geradorEbook = GeradorEbook.cria(ebook);
        geradorEbook.gera(ebook);

        PluginAcaoAposGeracao.carregaAcoes(ebook);
    }

}
