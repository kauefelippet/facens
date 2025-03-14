package Semestre_3.Estrutura_de_Dados.Aula_05.Fila;

import Semestre_3.Estrutura_de_Dados.Aula_03.Fila.Fila;

import javax.swing.*;

import static Semestre_3.Estrutura_de_Dados.Aula_05.Fila.Exercicio2.clonar;

public class Exercicio3 {

    public static String compararQtdElementos(Fila f1, Fila f2) {
        Fila cloneF1 = clonar(f1);
        Fila cloneF2 = clonar(f2);
        int elemF1 = 0, elemF2 = 0;

        while (!cloneF1.vazia()) {
            cloneF1.desenfileirar();
            elemF1++;
        }

        while (!cloneF2.vazia()) {
            cloneF2.desenfileirar();
            elemF2++;
        }

        if (elemF1 > elemF2) {
            return "Fila 1 possui mais elementos.";
        } else if (elemF2 > elemF1) {
            return "Fila 2 possui mais elementos.";
        } else {
            return "As filas possuem a mesma quantidade de elementos.";
        }
    }

    public static void main(String[] args) {

        Fila F1 = new Fila(5);
        Fila F2 = new Fila(5);

        int input = 1;
        do {
            try {
                input = Integer.parseInt(JOptionPane.showInputDialog("Digite um número a ser inserido na fila 1. Para finalizar, digite 0: "));
                F1.enfileirar(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida.");
            }
        } while (!F1.cheia() && input != 0);

        do {
            try {
                input = Integer.parseInt(JOptionPane.showInputDialog("Digite um número a ser inserido na fila 2. Para finalizar, digite 0: "));
                F2.enfileirar(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida.");
            }
        } while (!F2.cheia() && input != 0);

        JOptionPane.showMessageDialog(null, compararQtdElementos(F1, F2));
    }
}
