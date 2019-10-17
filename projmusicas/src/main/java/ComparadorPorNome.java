import java.util.Comparator;

public class ComparadorPorNome implements Comparator<Musica> {
    @Override
    public int compare(Musica o1, Musica o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
