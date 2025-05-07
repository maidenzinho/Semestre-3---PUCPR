public class ContaBancaria {
    // Atributos privados (complete)
    private double saldo;
    private String numeroConta;

    // Construtor (complete)
    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    // Método depositar (complete)
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método sacar (complete)
    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return false;
        }
        return true;
    }
}
