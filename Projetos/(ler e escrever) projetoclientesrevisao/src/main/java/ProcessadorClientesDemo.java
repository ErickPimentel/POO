import com.sun.javafx.collections.MappingChange;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class ProcessadorClientesDemo {
    public static void main(String[] args) throws IOException {
        ProcessadorClientes pc = new ProcessadorClientes();
        pc.lerTodosClientes("C:\\Users\\Erick Pimentel\\IdeaProjects\\projetoclientesrevisao\\src\\main\\java\\clientes");


        ComparadorPorCodigo cpc = new ComparadorPorCodigo();
        pc.gravarClientesOrdenadosPor("C:\\Users\\Erick Pimentel\\IdeaProjects\\projetoclientesrevisao\\src\\main\\java\\saidacodigo", cpc);

        ComparadorPorEstado cpe = new ComparadorPorEstado();
        pc.gravarClientesOrdenadosPor("C:\\Users\\Erick Pimentel\\IdeaProjects\\projetoclientesrevisao\\src\\main\\java\\saidaestado", cpe);

        ComparadorPorPrimeiroNome cpn = new ComparadorPorPrimeiroNome();
        pc.gravarClientesOrdenadosPor("C:\\Users\\Erick Pimentel\\IdeaProjects\\projetoclientesrevisao\\src\\main\\java\\saidaprimeironome",cpn);

    }
}
