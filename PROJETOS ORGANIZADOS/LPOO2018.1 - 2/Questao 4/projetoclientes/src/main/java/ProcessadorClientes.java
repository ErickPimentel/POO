import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ProcessadorClientes {
    public Set<Cliente> getClienteSet() {
        return clienteSet;
    }

    public void setClienteSet(Set<Cliente> clienteSet) {
        this.clienteSet = clienteSet;
    }

    Set<Cliente> clienteSet = new HashSet<>();


    public Set<Cliente> lerTodosClientes(Path pathOrigem) {
        Set<Cliente> tempClientes = new HashSet<>();

        // ler, remover duplicatas, montar e retornar
        List<String> linhas = new ArrayList<>();

        try {
            linhas = Files.readAllLines(pathOrigem, Charset.defaultCharset());
        } catch (Exception e) {
            System.out.println("    Erro! verifique o caminho!");
            System.out.println(e.toString());
            System.out.println(e.getStackTrace().toString());
            System.exit(0);
        }


        for (String linha : linhas) {
            // cod, nom, sobr, idade, end, cida, esta, cep
            String[] dados = linha.split(";");
            tempClientes.add(new Cliente(Integer.parseInt(dados[0]), dados[1], dados[2], Integer.parseInt(dados[3]), dados[4], dados[5], dados[6], dados[7]));
        }

        clienteSet.addAll(tempClientes);
        return tempClientes;
    }


    public void gravarClientesOrdenadosPor(Path destino, Comparator<Cliente> clienteComparator) {

        List<Cliente> listCliente = new LinkedList<>();
        try {
            PrintWriter out = new PrintWriter(destino.toString());
            listCliente.addAll(clienteSet);

            listCliente.sort(clienteComparator);

            for (Cliente cliente : listCliente) {
                System.out.println(cliente.toString());
                out.println(cliente.toString());
            }

            out.close();

        } catch (Exception e) {
            System.out.println("    Erro! verifique o caminho!");
            System.exit(0);
        }


    }

    public Map<Integer, List<Integer>> agruparClientesPorIdade() {
        Map<Integer, List<Integer>> grupoMap = new HashMap<>();

        for (Cliente cliente : getClienteSet()) {
            if (!grupoMap.containsKey(cliente.getIdade())) {
                grupoMap.put(cliente.getIdade(), new ArrayList<>());
            }
        }

        for (Integer i : grupoMap.keySet()) {
            for (Cliente cliente : getClienteSet()) {
                if (cliente.getIdade() == i) {
                    grupoMap.get(i).add(cliente.getCodigo());
                }
            }
        }

        System.out.println(grupoMap.toString());
        return grupoMap;
    }

    public void gravarMapaClientes(Path pathDestino) {

        Map<Integer, List<Integer>> tempMap = agruparClientesPorIdade();

        try {
            PrintWriter out = new PrintWriter(pathDestino.toString());

            for (Integer i : tempMap.keySet()) {
                out.print(i + "; ");
                for (Integer cod : tempMap.get(i)) {
                    out.print(cod + "; ");
                }
                out.println();
            }

            out.close();

        } catch (Exception e) {
            System.out.println("    Erro! verifique o caminho!");
            System.exit(0);
        }
    }


}
