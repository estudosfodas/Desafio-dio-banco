public abstract class Conta {
    private String numero;
    double saldo;
    private Cliente titular;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    public void transferir(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
    }
}