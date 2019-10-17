public class TestandoADivisao {
    public static void main(String[] args) {
        int i = 5571;

        try {
            i = i / 0;
        }catch (ArithmeticException e){
            System.out.println("Erro: " + e);
        }


        System.out.println("O resultado " + i);
    }
}
