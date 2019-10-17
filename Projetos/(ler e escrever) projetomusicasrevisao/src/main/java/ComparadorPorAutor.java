import java.util.Comparator;

public class ComparadorPorAutor implements Comparator<Musica> {
    @Override
    public int compare(Musica o1, Musica o2) {
        return o1.getAutor().compareTo(o2.getAutor());
    }
}
