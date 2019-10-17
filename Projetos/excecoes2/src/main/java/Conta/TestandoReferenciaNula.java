package Conta;

import Conta.Conta;

public class TestandoReferenciaNula {
    public static void main(String[] args) {
        try {
            Conta c = null;
            System.out.println("Saldo atual " + c.getSaldo());

        }catch (NullPointerException e){
            System.out.println("Erro: " + e);
        }
    }
}
