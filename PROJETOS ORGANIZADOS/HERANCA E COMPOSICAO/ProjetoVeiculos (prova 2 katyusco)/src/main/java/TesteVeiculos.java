import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TesteVeiculos {
    public static void main(String[] args) throws IOException {

        Piloto[] pilotos = new Piloto[4];
        Piloto p1 = new Piloto("Erick", 19);
        Piloto p2 = new Piloto("Ikael" ,20);
        Piloto p3 = new Piloto("Micael",20);
        Piloto p4 = new Piloto("Isaque", 18);
        pilotos[0] = p1;
        pilotos[1] = p2;
        pilotos[2] = p3;
        pilotos[3] = p4;

        List<Veiculo> lista = new ArrayList<Veiculo>();
        Barco b1 = new Barco("Combustivel de barco",pilotos,10,5);
        Barco b2 = new Barco("Combustivel de barco",pilotos,20,10);
        Foguete f1 = new Foguete("Combustivel de foguete", pilotos);
        Foguete f2 = new Foguete("Combustivel de foguete" , pilotos);
        Foguete f3 = new Foguete("Combustivel de foguete", pilotos);

        lista.add(b1);
        lista.add(b2);
        lista.add(f1);
        lista.add(f2);
        lista.add(f3);

        ProcessadorVeiculos pv = new ProcessadorVeiculos();
        pv.gravarVeiculos(lista, "C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\HERANCA E COMPOSICAO\\ProjetoVeiculos\\src\\main\\java\\saida");
    }
}
