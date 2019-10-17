import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    public static void main(String[] args) {
        String host = (args.length < 1) ? "localhost" : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            Calculadora_IF stub = (Calculadora_IF) registry.lookup("calculadora");
            System.out.println("A soma eh " + stub.add(5,10));
        }catch (Exception e){
            System.err.println("Cliente exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
