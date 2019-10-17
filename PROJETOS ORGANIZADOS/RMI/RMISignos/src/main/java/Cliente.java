import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    public static void main(String[] args) {
        String host = (args.length < 1) ? "localhost" : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            Signo_IF stub = (Signo_IF) registry.lookup("signo");

            System.out.println(stub.getMensagemSigno("Libra"));
            System.out.println(stub.getMensagemSigno("Aquario"));
        } catch (Exception e) {
            System.err.println("Cliente exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
