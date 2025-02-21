package Semestre_3.Estrutura_de_Dados.Aula_02.Pilha;

import javax.swing.*;

public class ExemploPilha {

    public static void main(String[] args) {

        Pilha p = new Pilha(Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da pilha: ")));

        for (int i=0; i<p.tamanho; i++) {
            p.empilhar(JOptionPane.showInputDialog("Digite o elemento a ser empilhado na posição " + i + ": "));
        }

        p.ExibePilha();
    }
}
