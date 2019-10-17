import java.io.IOException;

public class ProcessadorClientesDemo {
    public static void main(String[] args) throws IOException {
        ProcessadorClientes pc = new ProcessadorClientes();
        pc.lerTodosClientes("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\ProjetoClientes\\src\\main\\java\\clientes");

        ComparadorPorCodigo cpc = new ComparadorPorCodigo();
        pc.gravarClientesOrdenadosPor("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\ProjetoClientes\\src\\main\\java\\saidacodigo",cpc);

        ComparadorPorNome cpn = new ComparadorPorNome();
        pc.gravarClientesOrdenadosPor("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\ProjetoClientes\\src\\main\\java\\saidanome",cpn);

        ComparadorPorEstado cpe = new ComparadorPorEstado();
        pc.gravarClientesOrdenadosPor("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\ProjetoClientes\\src\\main\\java\\saidaestado", cpe);

        ComparadorPorIdade cpi = new ComparadorPorIdade();
        pc.gravarClientesOrdenadosPor("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\ProjetoClientes\\src\\main\\java\\saidaidade", cpi);

        pc.gravarMapaClientes("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\ProjetoClientes\\src\\main\\java\\saidamap");

    }
}
