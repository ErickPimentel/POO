import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor {
    private static Calculadora calculadora = new Calculadora();

    public static void main(String[] args) {
        try {
            Calculadora_IF stub = (Calculadora_IF) UnicastRemoteObject.exportObject(calculadora, 0);
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("calculadora", stub);
            System.err.println("Servidor pronto...");
        }catch (Exception e){
            System.err.println("Servidor exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
