package cotuba.tema;

import cotuba.plugin.PluginCss;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.List;

public class AplicadorTema {

    public String aplica(String html) {
        Document document = Jsoup.parse(html);

        List<String> temas =  PluginCss.carregaTemas();

        for (String css : temas) {
//            String css = "h1 { border-bottom: 1px dashed black; }";
            document.select("head").append("<style> " + css + " </style>");
        }

        return document.html();
    }

}
