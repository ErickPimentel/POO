import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class TestaPerformance {
    public static void main(String[] args){
        Collection<Integer> arraylist = new ArrayList<Integer>();
        long inicioarrayadd = System.currentTimeMillis();

        int total = 30000;
        for (int i = 0; i < total; i++){
            arraylist.add(i);
        }
        long fimarrayadd = System.currentTimeMillis();

        long inicioarraycontains = System.currentTimeMillis();

        for (int i = 0; i < total; i++){
            arraylist.contains(i);
        }
        long fimarraycontains = System.currentTimeMillis();


        long tempoarrayadd = fimarrayadd - inicioarrayadd;
        long tempoarraycontains = fimarraycontains - inicioarraycontains;



        Collection<Integer> linkedlist = new LinkedList<Integer>();
        long iniciolinkedlistadd = System.currentTimeMillis();


        int totallinkedlist = 30000;
        for (int i = 0; i < total; i++){
            linkedlist.add(i);
        }
        long fimlinkedlistadd = System.currentTimeMillis();

        long iniciolinkedlistcontains = System.currentTimeMillis();
        for (int i = 0; i < total; i++){
            linkedlist.contains(i);
        }
        long fimlinkedlistcontains = System.currentTimeMillis();


        long tempolinkedlistadd = fimlinkedlistadd - iniciolinkedlistadd;
        long tempolinkedlistcontains = fimlinkedlistcontains - iniciolinkedlistcontains;

        System.out.println("Tempo gasto ArrayList add: " + tempoarrayadd);
        System.out.println("Tempo gasto ArrayList contains: " + tempoarraycontains);
        System.out.println("Tempo gasto LinkedList add: " + tempolinkedlistadd);
        System.out.println("Tempo gasto LinkedList contains: " + tempolinkedlistcontains);


    }
}
