import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Cliente> listaclientes = new ArrayList<Cliente>();
    private List<DVD> listadvds = new ArrayList<DVD>();

    public boolean cadastrarCliente(Cliente cliente){
        if (listaclientes.contains(cliente)){
            return false;
        }else {
            listaclientes.add(cliente);
            return true;
        }
    }

    public boolean cadastrarDvds(DVD dvd){
        if(listadvds.contains(dvd)){
            return false;
        }else {
            listadvds.add(dvd);
            return true;
        }
    }

    public boolean fazerEmprestimo(Cliente c , DVD d){
        if (d.getCliente() == null){
            d.setCliente(c);
            return true;
        }else{
            return false;
        }
    }

    public int contarDVDsEmprestados(){
        int contador = 0;
        for (DVD d : listadvds){
            if (d.getCliente() != null){
                contador++;
            }
        }
        return contador;
    }

}
