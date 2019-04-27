package cotuba.cli;

import cotuba.application.Cotuba;

import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        LeitorOpcoesCLI leitorOpcoes = new LeitorOpcoesCLI(args);
        Path diretorioDosMD = leitorOpcoes.getDiretorioDosMD();
        String formato = leitorOpcoes.getFormato();
        Path arquivoDeSaida = leitorOpcoes.getArquivoDeSaida();
        Boolean modoVerboso = leitorOpcoes.getModoVerboso();

        try {
            Cotuba cotuba = new Cotuba();
            cotuba.executa(formato, diretorioDosMD, arquivoDeSaida);

            System.out.println("Arquivo gerado com sucesso: " + arquivoDeSaida);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            if(modoVerboso) {
                ex.printStackTrace();
            }
            System.exit(1);
        }

    }

}
