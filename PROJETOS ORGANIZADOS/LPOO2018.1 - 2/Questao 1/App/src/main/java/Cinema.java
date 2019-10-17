import java.util.ArrayList;

public class Cinema {
    private ArrayList<Espectador> espectadores = new ArrayList<Espectador>();

    public void addEspectador(Espectador espectador){
        espectadores.add(espectador);
    }

    public ArrayList<Espectador> getEspectadores(){
        return espectadores;
    }

}
