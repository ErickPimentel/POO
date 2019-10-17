public class BilheteManagement {
    private double price;
    private String day;

    // define constantes
    private static final double TARIFA_QUARTA = 3.50;
    private static final double TARIFA_FERIADO = 5.0;


    private boolean diaNormal = false;

    BilheteManagement(String day){
        this.day = day;

        if (this.day.equals("quarta")){
            setPrice(TARIFA_QUARTA);
        } else if (this.day.equals("feriado")){
            setPrice(TARIFA_FERIADO);
        } else {
            diaNormal = true;
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
        if (this.day.equals("quarta")){
            setPrice(TARIFA_QUARTA);
        } else if (this.day.equals("feriado")){
            setPrice(TARIFA_FERIADO);
        } else {
            diaNormal = true;
        }
    }



    public void setAsCrianca(){
        if (diaNormal){
            setPrice(8);
        }
    }

    public void setAsAdulto(){
        if (diaNormal){
            setPrice(12);
        }
    }

    public void setAsIdoso(){
        this.price = 4d;
    }

    public void setAsCustom(double price){
        this.price = price;
    }

}
