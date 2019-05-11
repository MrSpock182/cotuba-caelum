package cotuba.plugin;

import cotuba.domain.Ebook;

import java.util.ServiceLoader;
import java.util.function.Consumer;

public interface PluginAcaoAposGeracao {
    void gerou(Ebook ebook, Consumer<String> consumer);

    static void carregaAcoes(Ebook ebook, Consumer<String> consumer) {
        ServiceLoader<PluginAcaoAposGeracao> serviceLoader = ServiceLoader.load(PluginAcaoAposGeracao.class);
        for (PluginAcaoAposGeracao pluginAcaoAposGeracao : serviceLoader) {
            pluginAcaoAposGeracao.gerou(ebook, consumer);
        }
    }
}
