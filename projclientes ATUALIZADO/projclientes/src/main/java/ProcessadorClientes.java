import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ProcessadorClientes {
    private List<Cliente> lista = new ArrayList<Cliente>();

    public List<Cliente> getLista() {
        return lista;
    }

    public void setLista(List<Cliente> lista) {
        this.lista = lista;
    }

    public void lerClientes(String filePath) throws IOException {
        InputStream is = new FileInputStream(filePath);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

//        ISAQUE LER E ESCREVER
//        List<String> linhas = Files.readAllLines(Paths.get("zsdfsdf"));
//        Files.write(Paths.get("fdsf"), linhas,);
//

        while (linha != null){
            String[] objeto = linha.split(";");
            Cliente c = new Cliente(Integer.parseInt(objeto[0]),objeto[1],objeto[2],Integer.parseInt(objeto[3]),objeto[4],objeto[5],objeto[6],objeto[7]);
            //System.out.println(linha);
            lista.add(c);
            linha = br.readLine();
        }
        br.close();
    }

    public void gravarClientesOrdenadosPor(String pathDestino, Comparator<Cliente> comparador) throws IOException {
        OutputStream os = new FileOutputStream(pathDestino);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);


        Set<Cliente> hash = new HashSet<Cliente>();
        hash.addAll(lista); //jogar num HashSet para tirar as duplicatas
        // eh a mesma coisa de fazer:
//        for (Cliente c : lista){
//            hash.add(c);
//        }

        List<Cliente> listaordenada = new ArrayList<Cliente>();
        listaordenada.addAll(hash); // jogar o HashSet em um ArrayList para depois poder ordenar
        listaordenada.sort(comparador); // ordenando o Arraylist pelo comparador externo

        //System.out.println(tree.toString());

        bw.write(listaordenada.toString());
        bw.close();
    }



}
