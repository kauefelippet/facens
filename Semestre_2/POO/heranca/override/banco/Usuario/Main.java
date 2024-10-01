package Semestre_2.POO.heranca.override.banco.Usuario;

import Semestre_2.POO.heranca.override.banco.ContaCorrente;
import Semestre_2.POO.heranca.override.banco.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        ContaCorrente corrente = new ContaCorrente();
        ContaPoupanca poupanca = new ContaPoupanca();

        System.out.println("Depósito inicial (1000):\n");
        corrente.depositar(1000);
        corrente.verSaldo();

        poupanca.depositar(1000);
        poupanca.verSaldo();

        System.out.println("\n\nSaque (100):\n");
        corrente.sacar(100);
        poupanca.sacar(100);

        corrente.verSaldo();
        poupanca.verSaldo();

    }
}
