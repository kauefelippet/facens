package Semestre_3.Estrutura_de_Dados.Aula_10.Tree.Exercicios;

import Semestre_3.Estrutura_de_Dados.Aula_10.Tree.Tree;

import javax.swing.*;

public class Exercicio5 {

    public static void main(String[] args) {
        Tree tree = new Tree();

        do {
            String[] options = {
                    "Adicionar elemento",
                    "Remover elemento",
                    "Exibir Pré-Ordem",
                    "Exibir Em-Ordem",
                    "Exibir Pós-Ordem",
                    "Sair"
            };

            int opcao = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção:",
                    "Árvore",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            switch (opcao) {
                case 0 -> {
                    String input = JOptionPane.showInputDialog("Digite um número:");
                    if (input != null && !input.isEmpty()) {
                        try {
                            int numero = Integer.parseInt(input);
                            tree.insert(numero, tree.getRoot());
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número inteiro.");
                        }
                    }
                }

                case 1 -> {
                    String input = JOptionPane.showInputDialog("Digite o número a ser removido:");
                    if (input != null && !input.isEmpty()) {
                        try {
                            int numero = Integer.parseInt(input);
                            tree.remove(numero, tree.getRoot());
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número inteiro.");
                        }
                    }
                }

                case 2 -> JOptionPane.showMessageDialog(null, "Pré-Ordem:\n" + tree.preOrder(tree.getRoot()));

                case 3 -> JOptionPane.showMessageDialog(null, "Em-Ordem:\n" + tree.inOrder(tree.getRoot()));

                case 4 -> JOptionPane.showMessageDialog(null, "Pós-Ordem:\n" + tree.postOrder(tree.getRoot()));

                case 5 -> {
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    System.exit(0);
                }
            }
        } while (true);
    }
}
