public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= this.getSaldo() + this.limite) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }
}