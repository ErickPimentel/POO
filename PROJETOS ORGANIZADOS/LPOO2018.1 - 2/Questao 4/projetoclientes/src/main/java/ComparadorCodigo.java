import java.util.Comparator;

public class ComparadorCodigo implements Comparator<Cliente> {

    @Override
    public int compare(Cliente o1, Cliente o2) {
        return Integer.compare(o1.getCodigo(), o2.getCodigo());
    }

}