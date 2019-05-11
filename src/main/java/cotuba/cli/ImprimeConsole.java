package cotuba.cli;

import cotuba.application.AcaoFinalizar;

public class ImprimeConsole implements AcaoFinalizar {

    @Override
    public void executa(String s) {
        System.out.println(s);
    }
}