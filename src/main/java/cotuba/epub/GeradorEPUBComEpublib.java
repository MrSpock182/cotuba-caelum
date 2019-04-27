package cotuba.epub;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import cotuba.application.GeradorEbook;
import cotuba.domain.Capitulo;
import cotuba.domain.Ebook;
import nl.siegmann.epublib.domain.Book;
import nl.siegmann.epublib.domain.Resource;
import nl.siegmann.epublib.epub.EpubWriter;
import nl.siegmann.epublib.service.MediatypeService;

public class GeradorEPUBComEpublib implements GeradorEbook {

    public void gera(Ebook ebook) {
        Book epub = new Book();
        List<Capitulo> capitulos = ebook.getCapitulos();

        for (Capitulo capitulo : capitulos) {
            String html = capitulo.getConteudoHtml();
            epub.addSection("Capítulo", new Resource(html.getBytes(), MediatypeService.XHTML));

            EpubWriter epubWriter = new EpubWriter();

            try {
                epubWriter.write(epub, Files.newOutputStream(ebook.getArquivoSaida()));
            } catch (IOException ex) {
                throw new RuntimeException("Erro ao criar arquivo EPUB: " + ebook.getArquivoSaida().toAbsolutePath(), ex);
            }
        }

    }

}
