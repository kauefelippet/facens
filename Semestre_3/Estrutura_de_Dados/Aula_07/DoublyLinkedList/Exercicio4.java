package Semestre_3.Estrutura_de_Dados.Aula_07.DoublyLinkedList;

import javax.swing.*;

public class Exercicio4 {

    public static void main(String[] args) {

        ListaDupla lista = new ListaDupla();

        int opcao = -1;

        while(opcao != 2) {
            String[] options = {"Incluir elemento", "Buscar elemento", "Sair"};
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch(opcao) {
                case 0 -> {
                    int valor;
                    try {
                        valor = Integer.parseInt(JOptionPane.showInputDialog("Valor:"));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor inválido.");
                        break;
                    }

                    lista.insereNo(new NoDuplo(valor));
                }
                case 1 -> {
                    int valor;
                    try {
                        valor = Integer.parseInt(JOptionPane.showInputDialog("Valor:"));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valor inválido.");
                        break;
                    }

                    NoDuplo noEncontrado = lista.buscarValorReverse(valor);
                    if (noEncontrado != null) {
                        JOptionPane.showMessageDialog(null, "Valor encontrado na lista.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor não encontrado na lista.");
                    }
                }
            }
        }
    }
}
