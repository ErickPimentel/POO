import java.util.Comparator;

public class ComparadorPorAutor implements Comparator<Livro> {
    public int compare(Livro o1, Livro o2) {
        return o1.getAutor().compareTo(o2.getAutor());
    }
}
