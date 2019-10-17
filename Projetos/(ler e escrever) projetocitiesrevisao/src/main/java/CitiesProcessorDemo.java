import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CitiesProcessorDemo {
    public static void main(String[] args) throws IOException {
        CitiesProcessor c = new CitiesProcessor();

        Set<City> hashset = new HashSet<City>();
        hashset = c.buildSetOfCities("C:\\Users\\Erick Pimentel\\IdeaProjects\\projetocitiesrevisao\\src\\main\\java\\cities");
        //System.out.println(hashset.toString());

        ComparadorPorNome cpn = new ComparadorPorNome();
        c.writeSetOfCities("C:\\Users\\Erick Pimentel\\IdeaProjects\\projetocitiesrevisao\\src\\main\\java\\saidanome", cpn);

        ComparadorPorEstado cpe = new ComparadorPorEstado();
        c.writeSetOfCities("C:\\Users\\Erick Pimentel\\IdeaProjects\\projetocitiesrevisao\\src\\main\\java\\saidaestado", cpe);

        ComparadorPorZipCode cpz = new ComparadorPorZipCode();
        c.writeSetOfCities("C:\\Users\\Erick Pimentel\\IdeaProjects\\projetocitiesrevisao\\src\\main\\java\\saidazipcode", cpz);
    }


}
