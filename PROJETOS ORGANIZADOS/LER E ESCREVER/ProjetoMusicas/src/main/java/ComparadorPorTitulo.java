import java.util.Comparator;

public class ComparadorPorTitulo implements Comparator<Musica> {
    @Override
    public int compare(Musica o1, Musica o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
}
