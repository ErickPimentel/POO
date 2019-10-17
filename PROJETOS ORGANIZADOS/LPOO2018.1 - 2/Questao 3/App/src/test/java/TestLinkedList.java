import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;


public class TestLinkedList {


    @Test
    public void testDuplicada() {
        LinkedList<Aluno> lista = new LinkedList<>();
        Collections.addAll(lista, new Aluno("Bruno", 1.73), new Aluno("Jose", 1.75), new Aluno("Ana", 1.77));

        Aluno cloneAna = new Aluno("Ana", 1.77);
        Assert.assertTrue(lista.contains(cloneAna));

        Aluno pedro = new Aluno("Pedro", 1.77);
        Assert.assertFalse(lista.contains(pedro));

        Aluno cloneBruno = new Aluno("Bruno", 1.73);
        Assert.assertTrue(lista.contains(cloneBruno));

        lista.sort(new ComparadorPorAlura());
        Assert.assertEquals(lista.get(0), new Aluno("Bruno", 1.73));

        lista.sort(new ComparadorPorNome());
        Assert.assertEquals(lista.get(0), new Aluno("Ana", 1.77));

    }

    @Test
    public void testOrdenacao() {
        LinkedList<Aluno> lista = new LinkedList<>();
        Collections.addAll(lista, new Aluno("Bruno", 1.73), new Aluno("Jose", 1.75), new Aluno("Ana", 1.77));
        lista.sort(new ComparadorPorAlura());
        Assert.assertEquals(lista.get(0), new Aluno("Bruno", 1.73));
        Assert.assertEquals(lista.get(lista.size() -1), new Aluno("Ana", 1.77));


        lista.sort(new ComparadorPorNome());
        Assert.assertEquals(lista.get(0), new Aluno("Ana", 1.77));

    }
}
