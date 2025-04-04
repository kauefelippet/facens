package Semestre_3.Estrutura_de_Dados.Aula_07.DoublyLinkedList;

import javax.swing.*;

public class Exercicio2 {

    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        int opcao = -1;

        while (opcao != 2) {
            String[] options = {"Adicionar pessoa", "Listar pessoas", "Sair"};
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (opcao) {
                case 0 -> {
                    String nome = JOptionPane.showInputDialog("Nome:");
                    if (nome == null || nome.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nome inválido.");
                        break;
                    }
                    int idade;
                    try {
                        idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Idade inválida.");
                        break;
                    }
                    Pessoa novaPessoa = new Pessoa(nome, idade);
                    lista.insereNo(new NoDuplo(novaPessoa));
                }
                case 1 -> JOptionPane.showMessageDialog(null, lista.exibeLista());
                case 2 -> JOptionPane.showMessageDialog(null, "Saindo...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}

class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}
