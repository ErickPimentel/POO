import java.io.*;
import java.util.*;

public class ProcessadorMusica {
    private Set<Musica> hash = new HashSet<Musica>();

    public Set<Musica> lerMusicas(String pathFile) throws IOException {
        InputStream is = new FileInputStream(pathFile);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();
        while (linha != null){
            String[] objeto = linha.split(";");
            Musica m = new Musica(Integer.parseInt(objeto[0]),objeto[1], objeto[2], Integer.parseInt(objeto[3]));
            hash.add(m);
            //System.out.println(m.toString());
            linha = br.readLine();
        }

        br.close();

        return hash;
    }

    public void gravarMusicasOrdenadasPor(String pathDestino, Comparator<Musica> comparador) throws IOException {
        OutputStream os = new FileOutputStream(pathDestino);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        List<Musica> listaordenada = new ArrayList<Musica>();
        listaordenada.addAll(hash);
        listaordenada.sort(comparador);

        bw.write(listaordenada.toString());
        bw.close();
    }


}
