import java.util.ArrayList;
import java.util.List;

public class TesteMidia {
    public static void main(String[] args) {
        Locadora locadora = new Locadora();

        System.out.println("Pratilheira");
        System.out.println(locadora.getnaloja());
        System.out.println("Fora da loja");
        System.out.println(locadora.getalugados());
        System.out.println("\n");

        Midia dvd = new DVD();
        dvd.setTitulo("Saia Rodada no BardoCuzCuz");
        dvd.setAno(2019);
        dvd.setPreco(new Lancamento());

        Midia cd = new CD();
        cd.setTitulo("GD na Ilha");
        cd.setAno(2018);
        cd.setPreco(new Normal());

        Midia fita = new Fita();
        fita.setTitulo("Dora a Aventureira");
        fita.setAno(2005);
        fita.setPreco(new Infantil());

        locadora.colocar(dvd);
        locadora.colocar(cd);
        locadora.colocar(fita);

        System.out.println("Pratilheira");
        System.out.println(locadora.getnaloja());
        System.out.println("Fora da loja");
        System.out.println(locadora.getalugados());
        System.out.println("\n");

        locadora.alugar(cd);
        locadora.alugar(fita);

        System.out.println("Pratilheira");
        System.out.println(locadora.getnaloja());
        System.out.println("Fora da loja");
        System.out.println(locadora.getalugados());
        System.out.println("\n");


        locadora.retorna(cd);
        locadora.retorna(fita);

        System.out.println("Pratilheira");
        System.out.println(locadora.getnaloja());
        System.out.println("Fora da loja");
        System.out.println(locadora.getalugados());
        System.out.println("\n");

    }
}
