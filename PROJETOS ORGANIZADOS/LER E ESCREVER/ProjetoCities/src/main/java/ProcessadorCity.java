import java.io.*;
import java.util.*;

public class ProcessadorCity {
    private Set<City> hashset = new HashSet<City>();

    public Set<City> buildSetOfCities(String filePath) throws IOException {
        InputStream is = new FileInputStream(filePath);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);


        String[] objeto;
        String linha = br.readLine();
        while (linha != null){
            objeto = linha.split(", ");
            City c = new City(objeto[0], objeto[1], Integer.parseInt(objeto[2]));
            hashset.add(c);

            linha = br.readLine();
        }
        br.close();
        return hashset;
    }

    public void writeSetOfCities(String filePah, Comparator<City> comparador) throws IOException {
        OutputStream os = new FileOutputStream(filePah);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        List<City> lista = new ArrayList<City>();
        lista.addAll(hashset);
        lista.sort(comparador);

        for (City c : lista){
            bw.write(c.toString());
            bw.write("\n");
        }
        bw.close();
    }
}
