package cotuba.plugin;

import java.util.ServiceLoader;

public interface PluginAcaoAposGeracao {
    void gerou(IEbook ebook);

    static void carregaAcoes(IEbook ebook) {
        ServiceLoader<PluginAcaoAposGeracao> serviceLoader = ServiceLoader.load(PluginAcaoAposGeracao.class);
        for (PluginAcaoAposGeracao pluginAcaoAposGeracao : serviceLoader) {
            pluginAcaoAposGeracao.gerou(ebook);
        }
    }
}
