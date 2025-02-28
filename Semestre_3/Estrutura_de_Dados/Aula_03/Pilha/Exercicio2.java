package Semestre_3.Estrutura_de_Dados.Aula_03.Pilha;

import Semestre_3.Estrutura_de_Dados.Aula_02.Pilha.Pilha;

import javax.swing.*;

public class Exercicio2 {

    public static void main(String[] args) {

        Pilha p = new Pilha(5);
        String[] placasCarros = {"ABC-1234", "DEF-5678", "GHI-9101", "JKL-1121", "MNO-3141"};
        String placaInformada = JOptionPane.showInputDialog("Informe a placa do carro para verificar se ele está na rua.").toUpperCase();
        int quantidadeDesempilhada = 0;

        for (String placa : placasCarros) {
            p.empilhar(placa);
        }

        do {
            if (p.desempilhar().equals(placaInformada)) {
                JOptionPane.showMessageDialog(null, "O carro com a placa " + placaInformada + " está na rua. Para que ele consiga sair, " +
                        "será necessário desempilhar " + quantidadeDesempilhada + " carro(s) que estão na frente dele.");
                break;
            }
            quantidadeDesempilhada++;

            if (p.vazia()) {
                JOptionPane.showMessageDialog(null, "O carro com a placa " + placaInformada + " não está na rua.");
                break;
            }
        } while (!p.vazia());
    }
}