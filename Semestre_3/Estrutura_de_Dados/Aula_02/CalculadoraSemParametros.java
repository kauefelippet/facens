package Semestre_3.Estrutura_de_Dados.Aula_02;

import javax.swing.*;

public class CalculadoraSemParametros {

    static void modAdicao() {
        double v1, v2, res;

        try {
            v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
            v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida!");
            return;
        }

        res = v1 + v2;

        JOptionPane.showMessageDialog(null, "A soma dos valores é: " + res);
    }

    static void modSubtracao() {
        double v1, v2, res;

        try {
            v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
            v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida!");
            return;
        }

        res = v1 - v2;

        JOptionPane.showMessageDialog(null, "A subtração dos valores é: " + res);
    }

    static void modMultiplicacao() {
        double v1, v2, res;

        try {
            v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
            v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida!");
            return;
        }

        res = v1 * v2;

        JOptionPane.showMessageDialog(null, "A multiplicação dos valores é: " + res);
    }

    static void modDivisao() {
        double v1, v2, res;

        try {
            v1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
            v2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida!");
            return;
        }

        res = v1 / v2;

        JOptionPane.showMessageDialog(null, "A divisão dos valores é: " + res);
    }

    public static void main(String[] args) {
        int opcao;

        opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                Digite a opção desejada:\s
                1 - Adição
                2 - Subtração
                3 - Multiplicação
                4 - Divisão"""));

        switch (opcao) {
            case 1:
                modAdicao();
                break;
            case 2:
                modSubtracao();
                break;
            case 3:
                modMultiplicacao();
                break;
            case 4:
                modDivisao();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                break;
        }
    }
}
