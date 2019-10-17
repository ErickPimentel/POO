import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Signo_IF extends Remote {
    public String getMensagemSigno(String umSigno) throws RemoteException;
}
