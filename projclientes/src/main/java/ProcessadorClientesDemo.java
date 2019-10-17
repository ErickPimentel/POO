import java.io.IOException;
import java.util.Comparator;

public class ProcessadorClientesDemo {
    public static void main(String [] args) throws IOException {
        ProcessadorClientes pc = new ProcessadorClientes();
        pc.lerClientes("C:\\Users\\Erick Pimentel\\IdeaProjects\\projclientes\\src\\main\\java\\arquivo");

        ComparadorPrimeiroNome cpn = new ComparadorPrimeiroNome();
        pc.gravarClientesOrdenadosPor("C:\\Users\\Erick Pimentel\\IdeaProjects\\projclientes\\src\\main\\java\\saidanome", cpn);

        ComparadorPorIdade cpi = new ComparadorPorIdade();
        pc.gravarClientesOrdenadosPor("C:\\Users\\Erick Pimentel\\IdeaProjects\\projclientes\\src\\main\\java\\saidaidade", cpi);

        ComparadorPorEstado cpe = new ComparadorPorEstado();
        pc.gravarClientesOrdenadosPor("C:\\Users\\Erick Pimentel\\IdeaProjects\\projclientes\\src\\main\\java\\saidaestado",cpe);

        ComparadorPorCodigo cpc = new ComparadorPorCodigo();
        pc.gravarClientesOrdenadosPor("C:\\Users\\Erick Pimentel\\IdeaProjects\\projclientes\\src\\main\\java\\saidacodigo",cpc);
    }
}
