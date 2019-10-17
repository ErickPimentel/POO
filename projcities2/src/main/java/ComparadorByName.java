import java.util.Comparator;

public class ComparadorByName implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
