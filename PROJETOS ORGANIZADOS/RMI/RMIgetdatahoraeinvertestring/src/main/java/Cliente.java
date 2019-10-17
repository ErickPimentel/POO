import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    public static void main(String[] args) {
        String host = (args.length < 1) ? "localhost" : args[0];
        try {
            Registry registry = LocateRegistry.getRegistry(host);
            Servico_IF stub = (Servico_IF) registry.lookup("servico");
            System.out.println(stub.getDataHora());
            System.out.println("ERICK invertido eh " + stub.inverteString("ERICK"));
        }catch (Exception e){
            System.err.println("Cliente exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
