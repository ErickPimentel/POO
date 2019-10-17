import java.rmi.RemoteException;

public class Calculadora implements Calculadora_IF {
    public long add(long a, long b) throws RemoteException {
        return a+b;
    }
}
