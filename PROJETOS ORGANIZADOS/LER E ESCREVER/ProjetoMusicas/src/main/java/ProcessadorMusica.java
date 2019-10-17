import java.io.*;
import java.util.*;

public class ProcessadorMusica {
    private Set<Musica> hashset = new HashSet<Musica>();

    public Set<Musica> lerMusicas(String filePath) throws IOException {
        InputStream is = new FileInputStream(filePath);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String[] objeto;
        String linha = br.readLine();
        while (linha != null){
            objeto = linha.split(";");
            Musica m = new Musica(Integer.parseInt(objeto[0]),objeto[1],objeto[2], Integer.parseInt(objeto[3]));
            hashset.add(m);

            linha = br.readLine();
        }
        return hashset;
    }

    public void gravarMusicasOrdenadasPor(String filePath, Comparator<Musica> comparador) throws IOException {
        OutputStream os = new FileOutputStream(filePath);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        List<Musica> lista = new ArrayList<>();
        lista.addAll(hashset);
        lista.sort(comparador);

        for (Musica m : lista){
            bw.write(m.toString());
            bw.write("\n");
        }
        bw.close();
    }
}
