import java.util.ArrayList;
import java.util.List;

public class TesteFita {
    public static void main(String[] args) {

        List<Fita> lista = new ArrayList<Fita>();

        Fita f1 = new Fita();
        f1.setTitulo("Alice no pais das maravilhas");
        f1.setAno(2000);
        f1.setPreco(new Normal().preco());

        Fita f2 = new Fita();
        f2.setTitulo("Gd na Ilha");
        f2.setAno(2018);
        f2.setPreco(new Lancamento().preco());

        Fita f3 = new Fita();
        f3.setTitulo("Dora a Aventureira");
        f3.setAno(2015);
        f3.setPreco(new Infantil().preco());

        Fita f4 = new Fita();
        f4.setTitulo("Oscar");
        f4.setAno(2016);
        f4.setPreco(new SemanaDoOscar().preco());

        lista.add(f1);
        lista.add(f2);
        lista.add(f3);
        lista.add(f4);

        System.out.println(lista.toString());
    }
}
