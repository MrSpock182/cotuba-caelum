package cotuba.plugin;

import cotuba.domain.Ebook;

import java.util.ServiceLoader;

public interface PluginAcaoAposGeracao {
    void gerou(Ebook ebook);

    static void carregaAcoes(Ebook ebook) {
        ServiceLoader<PluginAcaoAposGeracao> serviceLoader = ServiceLoader.load(PluginAcaoAposGeracao.class);
        for (PluginAcaoAposGeracao pluginAcaoAposGeracao : serviceLoader) {
            pluginAcaoAposGeracao.gerou(ebook);
        }
    }
}
