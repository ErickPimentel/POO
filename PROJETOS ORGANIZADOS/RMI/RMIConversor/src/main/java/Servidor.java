import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor {

    private static Conversor conversor = new Conversor();

    public static void main(String[] args) {
        try {
            Conversor_IF stub = (Conversor_IF) UnicastRemoteObject.exportObject(conversor, 0);
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("conversor", stub);

            System.err.println("Servidor pronto...");
        } catch (Exception e) {
            System.err.println("Servidor exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
