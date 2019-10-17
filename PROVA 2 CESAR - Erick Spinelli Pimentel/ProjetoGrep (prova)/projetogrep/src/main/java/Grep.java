import java.io.*;
import java.util.*;

public class Grep {

    public boolean grep(String termo, String filePath){
        try {
            InputStream is = new FileInputStream("C:\\Users\\ifpb\\IdeaProjects\\projetogrep\\src\\main\\java\\books");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            OutputStream os = new FileOutputStream(filePath);
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            int count = 0;
            String linha;
            linha = br.readLine();
            while (linha != null){
                if(linha.contains(termo)){
                    bw.write(linha);
                    bw.write("\n");
                }
                count++;
                linha = br.readLine();
            }
            br.close();
            bw.close();
            return true;

        }catch (Exception e){
            return false;
        }
    }

    public void incluirLivro(int id, String novoTitulo, String novoArtista, String novoFormato, double preco) throws IOException {
        InputStream is = new FileInputStream("C:\\Users\\ifpb\\IdeaProjects\\projetogrep\\src\\main\\java\\books");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        List<String> lista = new ArrayList<String>();
        String linha;
        linha = br.readLine();
        while (linha != null){
            lista.add(linha);

            linha = br.readLine();
        }
        br.close();

        //System.out.println(lista.toString());
        String novoObjeto = id + ";" + novoArtista + ";" + novoTitulo + ";" + novoFormato  + ";" + preco;
        //System.out.println(novoObjeto);
        lista.add(novoObjeto);

        OutputStream os = new FileOutputStream("C:\\Users\\ifpb\\IdeaProjects\\projetogrep\\src\\main\\java\\books");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        for(String l : lista){
            //System.out.println(l);
            bw.write(l);
            bw.write("\n");
        }
        bw.close();
    }

    public boolean removerTodasOcorrencias(String termo) throws IOException {
        try {
            InputStream is = new FileInputStream("C:\\Users\\ifpb\\IdeaProjects\\projetogrep\\src\\main\\java\\books");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            List<String> lista = new ArrayList<String>();
            int count = 0;
            String linha;
            linha = br.readLine();
            while (linha != null){
                if(!linha.contains(termo)){
                    lista.add(linha);
                }
                count++;
                linha = br.readLine();
            }

            OutputStream os = new FileOutputStream("C:\\Users\\ifpb\\IdeaProjects\\projetogrep\\src\\main\\java\\books");
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            for(String l : lista){
                //System.out.println(l);
                bw.write(l);
                bw.write("\n");
            }
            br.close();
            bw.close();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void gravarLivrosOrdenadosPor(String filePath, Comparator<Livro> comparador) throws IOException {
        InputStream is = new FileInputStream("C:\\Users\\ifpb\\IdeaProjects\\projetogrep\\src\\main\\java\\books");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        List<Livro> lista = new ArrayList<Livro>();
        String[] objeto;
        String linha;
        linha = br.readLine();
        while (linha != null){
            objeto = linha.split(";");
            Livro l = new Livro(Integer.parseInt(objeto[0]),objeto[1], objeto[2],objeto[3], Double.parseDouble(objeto[4]));
            lista.add(l);

            linha = br.readLine();
        }
        br.close();

        OutputStream os = new FileOutputStream(filePath);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        lista.sort(comparador);
        bw.write(lista.toString());
        bw.close();

    }

    public Map<String, Livro> agruparLivrosFormato() throws IOException {
        InputStream is = new FileInputStream("C:\\Users\\ifpb\\IdeaProjects\\projetogrep\\src\\main\\java\\books");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        List<Livro> lista = new ArrayList<Livro>();
        String[] objeto;
        String linha;
        linha = br.readLine();
        while (linha != null){
            objeto = linha.split(";");
            Livro l = new Livro(Integer.parseInt(objeto[0]),objeto[1], objeto[2],objeto[3], Double.parseDouble(objeto[4]));
            lista.add(l);

            linha = br.readLine();
        }
        br.close();

        Map<String,Livro> hashmap = new HashMap<String, Livro>();
        for (Livro l : lista){
            hashmap.put(l.getFormato(), l);
        }

        return hashmap;

    }




}
