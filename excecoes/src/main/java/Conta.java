public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor) {
        if (valor < 0) {
            throw new DepositoNegativoException("Deposito negativo, tente um valor positivo");
        } else {
            this.saldo += valor;
        }
    }

    public void saca(double valor){
        if(this.saldo < valor){
            throw new SaldoInsuficienteException("Saldo Insuficiente, tente um valor menor");
        }
        else {
            this.saldo -= valor;
        }
    }
}
