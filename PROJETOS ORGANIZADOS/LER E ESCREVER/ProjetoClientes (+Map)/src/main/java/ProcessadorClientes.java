import java.io.*;
import java.util.*;

public class ProcessadorClientes {
    private List<Cliente> lista = new ArrayList<>();

    public List<Cliente> lerTodosClientes(String filePath) throws IOException {
        InputStream is = new FileInputStream(filePath);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String[] objeto;
        String linha = br.readLine();
        while (linha != null){
            objeto = linha.split(";");
            Cliente c = new Cliente(Integer.parseInt(objeto[0]), objeto[1], objeto[2], Integer.parseInt(objeto[3]), objeto[4], objeto[5], objeto[6], objeto[7]);
            lista.add(c);

            linha = br.readLine();
        }
        br.close();

        return lista;
    }

    public void gravarClientesOrdenadosPor(String filePath, Comparator<Cliente> comparador) throws IOException {
        OutputStream os = new FileOutputStream(filePath);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        Set<Cliente> hashset = new HashSet<Cliente>();
        hashset.addAll(lista);

        lista.clear();
        lista.addAll(hashset);
        lista.sort(comparador);

        for (Cliente c : lista){
            bw.write(c.toString());
            bw.write("\n");
        }
        bw.close();
    }

    public Map<Integer, List<Integer>> agruparClientesPorIdade(){
        Map<Integer, List<Integer>> hashmap = new HashMap<Integer, List<Integer>>();

        for (Cliente c : lista){
            if(!hashmap.containsKey(c.getIdade())){
                hashmap.put(c.getIdade(), new ArrayList<>());
            }
        }

        for (Integer i : hashmap.keySet()){
            for (Cliente c : lista){
                if (c.getIdade() == i){
                    hashmap.get(i).add(c.getCodigo());
                }
            }
        }
        return hashmap;
    }

    public void gravarMapaClientes(String filePath) throws IOException {
        OutputStream os = new FileOutputStream(filePath);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        Map<Integer, List<Integer>> hashmap = agruparClientesPorIdade();

        for (Integer i : hashmap.keySet()){
            bw.write("Idade: " + i + " Codigo(s): ");
            for (Integer cod: hashmap.get(i)){
                bw.write( cod + ";");
            }
            bw.write("\n");
        }
        bw.close();
    }
}
