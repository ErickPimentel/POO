import java.util.Comparator;

public class ComparadorPorFormato implements Comparator<Livro> {
    @Override
    public int compare(Livro o1, Livro o2) {
        return o1.getFormato().compareTo(o2.getFormato());
    }
}
