package Semestre_3.Estrutura_de_Dados.Aula_05.Fila;

import Semestre_3.Estrutura_de_Dados.Aula_03.Fila.Fila;

import javax.swing.*;

public class Exercicio1 {

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

        do {
            try {
                fila.enfileirar(Integer.parseInt(JOptionPane.showInputDialog("Digite um número a ser inserido na fila: ")));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida.");
            }
        } while (!fila.cheia());

        while (!fila.vazia()) {
            JOptionPane.showMessageDialog(null, fila.desenfileirar());
        }
    }
}