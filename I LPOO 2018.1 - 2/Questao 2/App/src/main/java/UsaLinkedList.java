import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class UsaLinkedList {
    public static void main(String[] args) {
        LinkedList<Aluno> lista = new LinkedList<>();

        Collections.addAll(lista, new Aluno("Bruno", 1.73), new Aluno("Jose", 1.75), new Aluno("Ana", 1.77));
        Aluno cloneAna = new Aluno("Ana", 1.77);
        if (lista.contains(cloneAna)) {
            System.out.println("A lista ja contem ana!");
        }

//        lista.sort(new Comparator<Aluno>() {
//            @Override
//            public int compare(Aluno o1, Aluno o2) {
//                return o1.getNome().compareTo(o2.getNome());
//            }
//        });

        lista.sort(new ComparadorPorNome());

        for (Aluno a1 : lista) {
            System.out.println(a1);
        }

//        lista.sort(new Comparator<Aluno>() {
//            @Override
//            public int compare(Aluno o1, Aluno o2) {
//                return Double.compare(o1.getAltura(), o2.getAltura());
//            }
//        });

        lista.sort(new ComparadorPorAlura());

        for (Aluno a1 : lista) {
            System.out.println(a1);
        }


    }
}
