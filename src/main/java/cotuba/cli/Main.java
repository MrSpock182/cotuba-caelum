package cotuba.cli;

import cotuba.application.Cotuba;

public class Main {

    public static void main(String[] args) {

        LeitorOpcoesCLI leitorOpcoes = new LeitorOpcoesCLI(args);
        Boolean modoVerboso = leitorOpcoes.getModoVerboso();

        try {
            Cotuba cotuba = new Cotuba();
            cotuba.executa(leitorOpcoes, System.out::println);

            System.out.println("Arquivo gerado com sucesso: " + leitorOpcoes.getArquivoDeSaida());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            if(modoVerboso) {
                ex.printStackTrace();
            }
            System.exit(1);
        }

    }

}
