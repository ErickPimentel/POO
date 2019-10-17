public class Bilhete {
    private double preco;
    private String dia;
    private boolean diaNormal = false;

    //CONSTANTES
    private static final double TARIFA_QUARTA = 3.50;
    private static final double TARIFA_FERIADO = 5.0;


    //CONSTRUTOR
    public Bilhete(String dia){
        this.setDia(dia);

        if (this.getDia().equals("quarta")){
            setPreco(TARIFA_QUARTA);
        }
        else if (this.getDia().equals("feriado")){
            setPreco(TARIFA_FERIADO);
        }
        else {
            setDiaNormal(true);
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;

        if (this.dia.equals("quarta")) {
            setPreco(TARIFA_QUARTA);
        } else if (this.dia.equals("feriado")) {
            setPreco(TARIFA_FERIADO);
        } else {
            diaNormal = true;

        }
    }

    public boolean isDiaNormal() {
        return diaNormal;
    }

    public void setDiaNormal(boolean diaNormal) {
        this.diaNormal = diaNormal;
    }

    public void setCrianca(){
        if (diaNormal) setPreco(8);
    }

    public void setAdulto(){
        if (diaNormal) setPreco(12);
    }

    public void setIdoso(){
        this.preco = 4;
    }
}
