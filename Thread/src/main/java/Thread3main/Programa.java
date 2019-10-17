package Thread3main;

public class Programa {
    public static void main(String[] args){

        Runnable r = new Runnable() {
            public void run() {
                for(int i = 0; i < 10000; i++){
                    System.out.println("Programa" + " valor: " + i);
                }
            }
        };
        Thread t1 = new Thread(r);
        t1.start();
        Thread t2 = new Thread(r);
        t2.start();
    }
}
