import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        String host = (args.length < 1) ? "localhost" : args[0];

        try {
            Registry registry = LocateRegistry.getRegistry(host);
            Conversor_IF stub = (Conversor_IF) registry.lookup("conversor");

            Scanner scanner = new Scanner(System.in);
            System.out.println("----------" + "Bem vindo!" + "----------");
            String resposta;
            while (true){
                System.out.println("Escolha uma das duas opcoes:");
                System.out.println("1 - tranformar decimal em binario");
                System.out.println("2 - tranformar decimal em hexadecimal");
                String escolha = scanner.next();
                if(escolha.equals("1")){
                    resposta = stub.decToBinary(scanner.nextInt());
                }
                else if (escolha.equals("2")){
                    resposta = stub.decToHex(scanner.nextInt());
                }
                else {
                    resposta = "Opcao de entrada invalida. Tente novamente";
                }

                System.out.println(resposta);
            }
        } catch (Exception e) {
            System.err.println("Cliente exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
