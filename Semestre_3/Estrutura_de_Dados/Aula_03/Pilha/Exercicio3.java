package Semestre_3.Estrutura_de_Dados.Aula_03.Pilha;

import Semestre_3.Estrutura_de_Dados.Aula_02.Pilha.Pilha;

public class Exercicio3 {

    public static void main(String[] args) {

        Pilha pilha = new Pilha(10);
        Pilha pilhaAux = new Pilha(10);
        int topoPilha;
        int elementosPar = 0;

        for (int i = 0; i < 10; i++) {
            pilha.empilhar(i);
        }

        while (!pilha.vazia()) {
            topoPilha = (int) pilha.desempilhar();
            pilhaAux.empilhar(topoPilha);

            if (topoPilha % 2 == 0) {
                elementosPar++;
            }
        }

        while (!pilhaAux.vazia()) {
            pilha.empilhar(pilhaAux.desempilhar());
        }

        System.out.println("Quantidade de elementos pares: " + elementosPar);
    }
}
