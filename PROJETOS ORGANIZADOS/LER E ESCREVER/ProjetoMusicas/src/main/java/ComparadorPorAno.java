import java.util.Comparator;

public class ComparadorPorAno implements Comparator<Musica> {
    @Override
    public int compare(Musica o1, Musica o2) {
        return Integer.compare(o1.getAno(), o2.getAno());
    }
}
