import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor {

    private static Signo signo = new Signo();

    public static void main(String[] args) {
        try {
            Signo_IF stub = (Signo_IF) UnicastRemoteObject.exportObject(signo, 0);
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("signo", stub);
            System.err.println("Servidor pronto...");
        } catch (Exception e) {
            System.err.println("Servidor exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
