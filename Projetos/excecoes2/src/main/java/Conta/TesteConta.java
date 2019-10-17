package Conta;

import Conta.Conta;

public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.setSaldo(100);
        try {
            c.saca(200);
        }catch (IllegalArgumentException e){
            System.out.println("Erro: " + e);
            System.out.println("Erro: " + e.getMessage());
        }


    }
}
