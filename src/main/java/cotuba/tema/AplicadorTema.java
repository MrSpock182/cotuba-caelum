package cotuba.tema;

import cotuba.domain.Capitulo;
import cotuba.plugin.PluginCotuba;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.List;

public class AplicadorTema {

    public void aplica(Capitulo capitulo) {
        String html = capitulo.getConteudoHtml();
        Document document = Jsoup.parse(html);

        List<String> temas = PluginCotuba.carregaTemas();

        for (String css : temas) {
//            String css = "h1 { border-bottom: 1px dashed black; }";
            document.select("head").append("<style> " + css + " </style>");
        }


        capitulo.setConteudoHtml(document.html());
    }

}
