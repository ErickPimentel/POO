import java.rmi.RemoteException;

public class Mensagem implements Mensagem_IF {
    public String getMensagem() throws RemoteException {
        return "Mensagem do servidor!";
    }
}
