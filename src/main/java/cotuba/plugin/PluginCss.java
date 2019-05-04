package cotuba.plugin;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public interface PluginCss {
    String css();

    static List<String> carregaTemas() {
        List<String> list = new ArrayList<>();
        ServiceLoader<PluginCss> serviceLoader = ServiceLoader.load(PluginCss.class);

        for (PluginCss pluginCotuba : serviceLoader) {
            list.add(pluginCotuba.css());
        }

        return list;
    }
}
