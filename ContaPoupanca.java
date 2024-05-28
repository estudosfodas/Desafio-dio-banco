public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void calcularJuros() {
        this.saldo += this.saldo * this.taxaJuros;
    }
}