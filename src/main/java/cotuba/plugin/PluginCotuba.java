package cotuba.plugin;

import cotuba.domain.Ebook;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public interface PluginCotuba {
    String css();
    void gerou(Ebook ebook);

    static void carregaAcoes(Ebook ebook) {
        ServiceLoader<PluginCotuba> serviceLoader = ServiceLoader.load(PluginCotuba.class);
        for (PluginCotuba pluginCotuba : serviceLoader) {
            pluginCotuba.gerou(ebook);
        }
    }

    static List<String> carregaTemas() {
        List<String> list = new ArrayList<>();
        ServiceLoader<PluginCotuba> serviceLoader = ServiceLoader.load(PluginCotuba.class);

        for (PluginCotuba pluginCotuba : serviceLoader) {
            list.add(pluginCotuba.css());
        }

        return list;
    }

}
