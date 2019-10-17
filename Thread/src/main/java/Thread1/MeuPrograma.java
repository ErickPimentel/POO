package Thread1;

import Thread1.BarraDeProgresso;
import Thread1.GeraPDF;

public class MeuPrograma {
    public static void main(String[] args) throws InterruptedException {
        GeraPDF gerapdf = new GeraPDF();
        Thread threaddopdf = new Thread(gerapdf);


        BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
        Thread threadbarradeprogresso = new Thread(barraDeProgresso);

        threaddopdf.start();
        threadbarradeprogresso.start();
    }
}
