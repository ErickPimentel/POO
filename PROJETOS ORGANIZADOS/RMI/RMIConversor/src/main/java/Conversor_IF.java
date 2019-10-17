import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Conversor_IF extends Remote {
    String decToBinary(int value) throws RemoteException;
    String decToHex(int value) throws RemoteException;
}
