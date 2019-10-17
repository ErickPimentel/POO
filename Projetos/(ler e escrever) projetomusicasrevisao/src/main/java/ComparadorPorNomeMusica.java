import java.util.Comparator;

public class ComparadorPorNomeMusica implements Comparator<Musica> {

    @Override
    public int compare(Musica o1, Musica o2) {
        return o1.getNomemusica().compareTo(o2.getNomemusica());
    }
}
