import java.util.Comparator;

public class ComparadorPorCodigo implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        return Integer.compare(o1.getCodigo(),o2.getCodigo());
    }
}
