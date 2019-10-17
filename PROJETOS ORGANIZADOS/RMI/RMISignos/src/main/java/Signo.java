import java.rmi.RemoteException;
import java.util.*;

public class Signo implements Signo_IF {
    private Map<String, List<String>> hashmap = new HashMap<String, List<String>>();

//    public void adicionarSigno(String umSigno) throws RemoteException{
//        if (!hashmap.containsKey(umSigno)){
//            hashmap.put(umSigno, new ArrayList<String>());
//        }
//    }
//
//    public void adicionarMensagemDeSigno(String umSigno, String mensagem) throws RemoteException{
//        hashmap.get(umSigno).add(mensagem);
//    }

    public String getMensagemSigno(String umSigno) throws RemoteException {
        hashmap.put("Libra", new ArrayList<String>());
        hashmap.get("Libra").add("voce eh foda");
        hashmap.get("Libra").add("voce eh foda2");
        hashmap.get("Libra").add("voce eh foda3");

        hashmap.put("Aquario", new ArrayList<String>());
        hashmap.get("Aquario").add("voce eh um lixo");
        hashmap.get("Aquario").add("voce eh um lixo2");
        hashmap.get("Aquario").add("voce eh um lixo3");



        if (hashmap.containsKey(umSigno)){
            int tamanho = hashmap.get(umSigno).size();
            Random r = new Random();
            int numde0atetamanho = r.nextInt(tamanho);
            return hashmap.get(umSigno).get(numde0atetamanho);
        }
        else return "Signo nao foi encontrado";
    }
}
