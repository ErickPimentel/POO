import java.io.*;
import java.util.*;

public class ProcessadorClientes {

    private List<Cliente> lista = new ArrayList<Cliente>();

    public List<Cliente> lerTodosClientes(String filePath) throws IOException {
        InputStream is = new FileInputStream(filePath);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String[] objeto;
        String linha;
        linha = br.readLine();
        while (linha != null){
            //System.out.println(linha);
            objeto = linha.split(";");
            Cliente c = new Cliente(Integer.parseInt(objeto[0]),objeto[1], objeto[2],Integer.parseInt(objeto[3]), objeto[4],objeto[5], objeto[6], objeto[7]);
            lista.add(c);
            linha = br.readLine();
        }

        br.close();
        //System.out.println(lista.toString());
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
        bw.write(lista.toString());
        bw.close();
    }

    public Map<Integer,List<Integer>> agruparClientesPorIdade(){

        Map<Integer, List<Integer>> hashmap = new HashMap<>();

        for(Cliente cliente : lista){
            if(!hashmap.containsKey(cliente.getIdade())){
                hashmap.put(cliente.getIdade(),new ArrayList<>());
            }
        }

        for (Integer i: hashmap.keySet()){
            for (Cliente cliente : lista){
                if (cliente.getIdade() == i){
                    hashmap.get(i).add(cliente.getCodigo());
                }
            }
        }

        System.out.println(hashmap.toString());
        return hashmap;
    }

    public void gravarMapaClientes(String filePath){

    }


}
