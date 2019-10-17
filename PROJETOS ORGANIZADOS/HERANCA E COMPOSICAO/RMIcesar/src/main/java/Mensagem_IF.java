import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Mensagem_IF extends Remote {
    public String getMensagem() throws RemoteException;
}
