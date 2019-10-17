import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor {
    private static Servico servico = new Servico();

    public static void main(String[] args) {
        try {
            Servico_IF stub = (Servico_IF) UnicastRemoteObject.exportObject(servico,0);
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("servico", stub);
            System.err.println("Servidor pronto...");
        }catch (Exception e){
            System.err.println("Servidor exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
