import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor {

    private static Mensagem mensagem = new Mensagem();

    public static void main(String[] args) {
        try {
            Mensagem_IF stub =(Mensagem_IF) UnicastRemoteObject.exportObject(mensagem,0);
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("mensagem", stub);
            System.err.println("Servidor pronto...");

        } catch (Exception e) {
            System.err.println("Servidor exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
