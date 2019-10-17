import java.io.*;
import java.util.*;

public class Grep {

    //ARQUIVOS
    private static final String ARQUIVO_BOOKS = "C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\ProjetoGrep\\src\\main\\java\\books";


    public boolean grep(String termo, String filePath) throws IOException {
        try {
            InputStream is = new FileInputStream(ARQUIVO_BOOKS);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            List<String> lista = new ArrayList<String>();
            String linha = br.readLine();
            while (linha != null){
                if (linha.contains(termo)){
                    lista.add(linha);
                }
                linha = br.readLine();
            }
            br.close();

            OutputStream os = new FileOutputStream(filePath);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            for (String l : lista){
                bw.write(l);
                bw.write("\n");
            }
            bw.close();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean incluirLivro(int id, String novotitulo, String novoautor, String novoformato, double novopreco) throws IOException {
        InputStream is = new FileInputStream(ARQUIVO_BOOKS);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        List<String> lista = new ArrayList<String>();
        String linha = br.readLine();
        while (linha != null){
            lista.add(linha);
            linha = br.readLine();
        }
        br.close();

        String novoObjeto = id + ";" + novotitulo + ";" + novoautor + ";" + novoformato + ";" + novopreco;
        if (lista.contains(novoObjeto)){
            return false;
        }
        else {
            lista.add(novoObjeto);
            OutputStream os = new FileOutputStream(ARQUIVO_BOOKS);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            for (String l : lista){
                bw.write(l);
                bw.write("\n");
            }
            bw.close();
            return true;
        }
    }
    public boolean removerTodasOcorrencias(String termo) throws IOException {
        try {
            InputStream is = new FileInputStream(ARQUIVO_BOOKS);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            List<String> lista = new ArrayList<String>();
            String linha;
            linha = br.readLine();
            while (linha != null) {
                if (!linha.contains(termo)){
                    lista.add(linha);
                }
                linha = br.readLine();
            }
            br.close();

            OutputStream os = new FileOutputStream(ARQUIVO_BOOKS);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            for (String l : lista) {
                bw.write(l);
                bw.write("\n");
            }
            bw.close();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void gravarLivrosOrdenadosPor(String filePath, Comparator<Livro> comparador) throws IOException {
        InputStream is = new FileInputStream(ARQUIVO_BOOKS);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        Set<Livro> hashset = new HashSet<Livro>();
        String[] objeto;
        String linha = br.readLine();
        while (linha != null){
            objeto = linha.split(";");
            Livro l = new Livro(Integer.parseInt(objeto[0]), objeto[1], objeto[2], objeto[3],Double.parseDouble(objeto[4]));
            hashset.add(l);
            linha = br.readLine();
        }
        br.close();

        List<Livro> lista = new ArrayList<Livro>();
        lista.addAll(hashset);
        lista.sort(comparador);

        OutputStream os = new FileOutputStream(filePath);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        for (Livro l : lista) {
            bw.write(l.toString());
            bw.write("\n");
        }
        bw.close();
    }

    public Map<String, List<String>> agruparLivrosPorFormato() throws IOException {
        InputStream is = new FileInputStream(ARQUIVO_BOOKS);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        Set<Livro> hashset = new HashSet<Livro>();
        String[] objeto;
        String linha = br.readLine();
        while (linha != null){
            objeto = linha.split(";");
            Livro l = new Livro(Integer.parseInt(objeto[0]), objeto[1], objeto[2], objeto[3],Double.parseDouble(objeto[4]));
            hashset.add(l);
            linha = br.readLine();
        }
        br.close();

        List<Livro> lista = new ArrayList<Livro>();
        lista.addAll(hashset);

        Map<String,List<String>> hashmap = new HashMap<String, List<String>>();

        //CRIAR OS ARRAYLIST COM "Formato" como Key
        for (Livro l : lista){
            if (!hashmap.containsKey(l.getFormato())){ //se o hashmap nao tiver a key... crie um arraylist e bote o formato como key
                hashmap.put(l.getFormato(), new ArrayList<>());
            }
        }

        //ADICIONAR OS ITENS AO ARRAYLIST
        for (String h : hashmap.keySet()){
            for (Livro l : lista){
                if (l.getFormato().equals(h)){
                    hashmap.get(h).add(l.getTitulo());
                }
            }
        }

        return hashmap;

    }
}
