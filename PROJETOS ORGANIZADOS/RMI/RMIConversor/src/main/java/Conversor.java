import java.rmi.RemoteException;

public class Conversor implements Conversor_IF {
    public String decToBinary(int value) throws RemoteException {
        return value + " em binario eh " + Integer.toBinaryString(value);
    }

    public String decToHex(int value) throws RemoteException {
        return value + " em hexadecimal eh " + Integer.toHexString(value);
    }
}
