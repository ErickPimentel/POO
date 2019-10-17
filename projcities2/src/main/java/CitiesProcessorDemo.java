import java.io.IOException;
import java.util.Set;

public class CitiesProcessorDemo {
    public static void main (String[] args) throws IOException {

        CitiesProcessor cp = new CitiesProcessor();
        Set<City> set = cp.buildSetOfCities("C:\\Users\\Erick Pimentel\\IdeaProjects\\projcities2" +
                                                        "\\src\\main\\java\\cities");




        ComparadorByName cbn = new ComparadorByName();
        cp.writeSetOfCities("C:\\Users\\Erick Pimentel\\IdeaProjects\\projcities2" +
                                            "\\src\\main\\java\\saidanome", cbn);

        ComparadorByState cbs = new ComparadorByState();
        cp.writeSetOfCities("C:\\Users\\Erick Pimentel\\IdeaProjects\\projcities2" +
                "\\src\\main\\java\\saidastate", cbs);

        ComparadorByCep cbc = new ComparadorByCep();
        cp.writeSetOfCities("C:\\Users\\Erick Pimentel\\IdeaProjects\\projcities2" +
                "\\src\\main\\java\\saidacep", cbc);



    }
}
