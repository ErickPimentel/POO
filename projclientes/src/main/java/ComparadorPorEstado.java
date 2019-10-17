import java.util.Comparator;

public class ComparadorPorEstado implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.getEstado().compareTo(o2.getEstado());
    }
}
