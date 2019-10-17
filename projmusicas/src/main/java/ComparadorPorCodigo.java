import java.util.Comparator;

public class ComparadorPorCodigo implements Comparator<Musica> {
    @Override
    public int compare(Musica o1, Musica o2) {
        return Integer.compare(o1.getCodigo(), o2.getCodigo());
    }
}
