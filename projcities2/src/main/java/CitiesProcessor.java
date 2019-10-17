import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class CitiesProcessor {
    Set<City> citySet = new HashSet<City>();

    public void setClienteSet(Set<City> citySet){
        this.citySet = citySet;
    }

    public Set<City> getCitySet(){
        return citySet;
    }

    public Set<City> buildSetOfCities(String filePath) throws IOException {
        InputStream is = new FileInputStream(String.valueOf(filePath));
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();
        while (linha != null){
            String[] objeto = linha.split(", ");
            City c = new City(objeto[0],objeto[1], objeto[2]);
            //System.out.println(c.toString());
            citySet.add(c);
            linha = br.readLine();
        }

        //System.out.println(tree.toString());

        return citySet;
    }

    public void writeSetOfCities(String pathDestino, Comparator<City> comparator) throws FileNotFoundException {
        OutputStream os = new FileOutputStream(pathDestino);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        List<City> listaordenada = new ArrayList<City>();
        listaordenada.addAll(citySet);
        listaordenada.sort(comparator);

        try {
            bw.write(listaordenada.toString());
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
