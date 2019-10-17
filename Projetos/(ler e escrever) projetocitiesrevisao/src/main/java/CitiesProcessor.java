import java.io.*;
import java.util.*;

public class CitiesProcessor {
    private Set<City> hashset = new HashSet<City>();

    public Set<City> buildSetOfCities(String filePath) throws IOException {
        InputStream is = new FileInputStream(filePath);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String[] objeto;
        String linha = br.readLine();
        while (linha != null) {
            objeto = linha.split(", ");
            City c = new City(objeto[0],objeto[1], objeto[2]);
            hashset.add(c);
            linha = br.readLine();
            //System.out.println(linha);
        }
        br.close();
        return hashset;
    }

    public void writeSetOfCities(String pathDestino, Comparator<City> comparador) throws IOException {
        OutputStream os = new FileOutputStream(pathDestino);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        List<City> lista = new ArrayList<City>();
        lista.addAll(hashset);
        lista.sort(comparador);

        //System.out.println(lista.toString());
        bw.write(lista.toString());
        bw.close();
    }




}
