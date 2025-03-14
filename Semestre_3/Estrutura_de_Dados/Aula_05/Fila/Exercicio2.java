package Semestre_3.Estrutura_de_Dados.Aula_05.Fila;

import Semestre_3.Estrutura_de_Dados.Aula_03.Fila.Fila;

import javax.swing.*;

public class Exercicio2 {

    public static Fila clonar(Fila fila) {
        Fila filaClonada = new Fila(fila.getTamanho());
        int[] elementos = new int[fila.getTamanho()];
        int index = 0;

        while (!fila.vazia()) {
            elementos[index++] = Integer.parseInt(fila.desenfileirar());
        }

        for (int i = 0; i < index; i++) {
            fila.enfileirar(elementos[i]);
            filaClonada.enfileirar(elementos[i]);
        }

        return filaClonada;
    }

    public static int calcularMaior(Fila fila) {
        Fila clone = clonar(fila);
        int maior = Integer.parseInt(clone.desenfileirar());

        while (!clone.vazia()) {
            int numero = Integer.parseInt(clone.desenfileirar());
            if (numero > maior) {
                maior = numero;
            }
        }

        return maior;
    }

    public static int calcularMenor(Fila fila) {
        Fila clone = clonar(fila);
        int menor = Integer.parseInt(clone.desenfileirar());

        while (!clone.vazia()) {
            int numero = Integer.parseInt(clone.desenfileirar());
            if (numero < menor) {
                menor = numero;
            }
        }

        return menor;
    }

    public static int calcularMedia(Fila fila) {
        Fila clone = clonar(fila);
        int soma = 0;
        int quantidade = 0;

        while (!clone.vazia()) {
            soma += Integer.parseInt(clone.desenfileirar());
            quantidade++;
        }

        return soma / quantidade;
    }

    public static void main(String[] args) {

        int tamanho;

        do {
            try {
                tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da fila: "));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Tamanho inválido.");
                tamanho = 0;
            }
        } while (!(tamanho > 0));

        Fila fila = new Fila(tamanho);

        int num = 1;
        do {
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número a ser inserido na fila: "));
                fila.enfileirar(num);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida.");
            }
        } while (!fila.cheia() && num != 0);

        JOptionPane.showMessageDialog(null, "Maior: " + calcularMaior(fila));
        JOptionPane.showMessageDialog(null, "Menor: " + calcularMenor(fila));
        JOptionPane.showMessageDialog(null, "Média: " + calcularMedia(fila));
    }
}
