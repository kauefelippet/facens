package Semestre_3.Estrutura_de_Dados.Aula_07.DoublyLinkedList;

import Semestre_3.Estrutura_de_Dados.Aula_03.Fila.Fila;

import javax.swing.*;

public class Exercicio3 {

    public static void main(String[] args) {

        Fila fila = new Fila(10);
        ListaDupla listaDupla = new ListaDupla();

        for (int i = 0; i < 10; i++) {
            fila.enfileirar((int) (Math.random() * 100));
        }

        for (int i = 0; i < fila.getTamanho(); i++) {
            listaDupla.insereNo(new NoDuplo(fila.desenfileirar()));
        }

        JOptionPane.showMessageDialog(null, listaDupla.exibeLista(), "Lista Dupla", JOptionPane.INFORMATION_MESSAGE);
    }
}
