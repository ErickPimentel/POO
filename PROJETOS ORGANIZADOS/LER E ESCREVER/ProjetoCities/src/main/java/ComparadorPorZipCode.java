import java.util.Comparator;

public class ComparadorPorZipCode implements Comparator<City> {
    @Override
    public int compare(City o1, City o2) {
        return Integer.compare(o1.getZipcode(), o2.getZipcode());
    }
}
