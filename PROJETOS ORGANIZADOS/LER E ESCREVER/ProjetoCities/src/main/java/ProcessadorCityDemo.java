import java.io.IOException;

public class ProcessadorCityDemo {
    public static void main(String[] args) throws IOException {
        ProcessadorCity pc = new ProcessadorCity();
        pc.buildSetOfCities("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\src\\main\\java\\cities");

        ComparadorPorNome cpn = new ComparadorPorNome();
        pc.writeSetOfCities("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\src\\main\\java\\saidanome",cpn);

        ComparadorPorEstado cpe = new ComparadorPorEstado();
        pc.writeSetOfCities("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\src\\main\\java\\saidaestado", cpe);

        ComparadorPorZipCode cpzc = new ComparadorPorZipCode();
        pc.writeSetOfCities("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\src\\main\\java\\saidazipcode",cpzc);
    }
}
