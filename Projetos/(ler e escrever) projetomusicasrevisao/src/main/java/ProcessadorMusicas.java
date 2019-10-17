import java.io.*;
import java.util.*;

public class ProcessadorMusicas {
    private Set<Musica> hashset = new HashSet<>();

    public Set<Musica> lerMusicas(String filePath) throws IOException {
        InputStream is = new FileInputStream(filePath);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String[] objeto;
        String linha = br.readLine();
        while (linha != null){

            objeto = linha.split(";");
            Musica m = new Musica(Integer.parseInt(objeto[0]), objeto[1], objeto[2], Integer.parseInt(objeto[3]));
            hashset.add(m);
            //System.out.println(linha);
            linha = br.readLine();
        }
        br.close();
        //System.out.println(hashset.toString());
        return hashset;
    }


    public void gravarMusicasOrdenadasPor(String filePath, Comparator<Musica> comparador) throws IOException {
        OutputStream os = new FileOutputStream(filePath);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        List<Musica> lista = new ArrayList<>();
        lista.addAll(hashset);
        lista.sort(comparador);


        bw.write(lista.toString());
        bw.close();

    }
}
