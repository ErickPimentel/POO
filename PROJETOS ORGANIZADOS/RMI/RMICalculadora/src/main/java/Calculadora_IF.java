import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora_IF extends Remote {
    public long add(long a , long b) throws RemoteException;
}
