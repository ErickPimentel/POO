import java.util.Comparator;

public class ComparadorPorIdade implements Comparator<Cliente> {
    @Override
    public int compare(Cliente o1, Cliente o2) {
        return Integer.compare(o1.getIdade(),o2.getIdade());
    }
}
