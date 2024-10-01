package Semestre_2.POO.heranca.override.banco;

public abstract class ContaBancaria {

    private double saldo = 0;

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);

    public abstract void verSaldo();

    protected double getSaldo() {
        return this.saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
