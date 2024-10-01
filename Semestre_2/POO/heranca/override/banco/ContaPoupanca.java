package Semestre_2.POO.heranca.override.banco;

public class ContaPoupanca extends ContaBancaria {

    @Override
    public void sacar(double valor) {
        this.setSaldo(this.getSaldo() - valor * 1.0025); // taxa de 0.25%
    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor * 0.9975); // taxa de 0.25%
    }

    @Override
    public void verSaldo() {
        System.out.println("O saldo atual da conta poupança é de R$" + getSaldo());
    }
}
