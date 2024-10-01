package Semestre_2.POO.heranca.override.banco;

public class ContaCorrente extends ContaBancaria {

    @Override
    public void sacar(double valor) {
        this.setSaldo(this.getSaldo() - valor * 1.005); // taxa de 0.5%
    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor * 0.995); // taxa de 0.5%
    }

    @Override
    public void verSaldo() {
        System.out.println("O saldo atual da conta corrente é de R$" + getSaldo());
    }
}
