import java.util.Comparator;

public class ComparadorPorId implements Comparator<Livro> {
    @Override
    public int compare(Livro o1, Livro o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
