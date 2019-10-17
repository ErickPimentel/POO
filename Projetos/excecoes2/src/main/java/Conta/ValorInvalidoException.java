package Conta;

public class ValorInvalidoException extends RuntimeException {
    ValorInvalidoException(String message){
        super(message);
    }
}
