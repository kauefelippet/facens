package Semestre_3.Estrutura_de_Dados.Aula_03.Pilha;

import Semestre_3.Estrutura_de_Dados.Aula_02.Pilha.Pilha;
import javax.swing.*;
import java.util.Arrays;

public class Exercicio4 {

    public static void main(String[] args) {

        int[] array = new int[8];
        Pilha P = new Pilha(8);
        Pilha N = new Pilha(8);

        for (int i = 0; i < 8; i++) {
            try {
                array[i] = Integer.parseInt(JOptionPane.showInputDialog(Arrays.toString(array) + "\nDigite o valor para o índice " + i));
            } catch (NumberFormatException e) {
                array[i] = 0;
            }

            if (array[i] > 0) {
                P.empilhar(array[i]);
            } else if (array[i] < 0) {
                N.empilhar(array[i]);
            } else {
                P.desempilhar();
                N.desempilhar();
            }
        }

        System.out.println("Pilha P: ");
        P.ExibePilha();
        System.out.println("Pilha N: ");
        N.ExibePilha();
    }
}