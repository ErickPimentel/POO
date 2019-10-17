import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Servico implements Servico_IF {
    public String getDataHora() throws RemoteException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return sdf.format(Calendar.getInstance().getTime());
    }

    public String inverteString(String string) throws RemoteException {
        String retorno;
        StringBuffer strb = new StringBuffer(string);
        retorno = strb.reverse().toString();
        return retorno;
    }
}
