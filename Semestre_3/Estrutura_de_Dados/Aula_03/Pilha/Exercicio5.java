package Semestre_3.Estrutura_de_Dados.Aula_03.Pilha;

import Semestre_3.Estrutura_de_Dados.Aula_02.Pilha.Pilha;

import javax.swing.*;

public class Exercicio5 {

    public static void main(String[] args) {

        String urlAtual = null;
        Pilha back = new Pilha(5);
        Pilha forward = new Pilha(5);
        int opcao = 0;

        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                        1 - Nova URL\s
                        2 - Retroceder
                        3 - Avançar
                        4 - URL Atual
                        5 - Sair"""));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
            }

            switch (opcao) {
                case 1:
                    if (urlAtual != null) back.empilhar(urlAtual);

                    urlAtual = JOptionPane.showInputDialog("Insira a URL abaixo:");
                    JOptionPane.showMessageDialog(null, "URL acessada!");
                    break;
                case 2:
                    if (back.vazia()) {
                        JOptionPane.showMessageDialog(null, "Não há uma URL anterior à atual.");
                    } else {
                        forward.empilhar(urlAtual);
                        urlAtual = (String) back.desempilhar();
                        JOptionPane.showMessageDialog(null, "Você retrocedeu para a URL " + urlAtual);
                    }
                    break;
                case 3:
                    if (forward.vazia()) {
                        JOptionPane.showMessageDialog(null, "Não foi inserida uma URL posterior à atual.");
                    } else {
                        back.empilhar(urlAtual);
                        urlAtual = (String) forward.desempilhar();
                        JOptionPane.showMessageDialog(null, "Você avançou para a URL " + urlAtual);
                    }
                    break;
                case 4:
                    if (urlAtual != null) {
                        JOptionPane.showMessageDialog(null, "URL Atual: " + urlAtual);
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhuma URL ainda foi inserida.");
                    }
            }
        } while (opcao != 5);
    }
}
