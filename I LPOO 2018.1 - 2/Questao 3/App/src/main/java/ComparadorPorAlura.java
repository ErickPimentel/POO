import java.util.Comparator;

public class ComparadorPorAlura implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getAltura(), o2.getAltura());
    }
}
