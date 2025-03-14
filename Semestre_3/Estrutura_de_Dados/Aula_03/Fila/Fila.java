/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semestre_3.Estrutura_de_Dados.Aula_03.Fila;

/**
 * @author bruno
 */
public class Fila {
    int tamanho;
    int inicio;
    int fim;
    int total;
    int[] vetor;

    public Fila(int tam) {
        inicio = 0;
        fim = 0;
        total = 0;
        tamanho = tam;
        vetor = new int[tam];
    }

    public boolean vazia() {
        return total == 0;
    }

    public boolean cheia() {
        return total >= tamanho;
    }

    public void enfileirar(int elem) {
        if (!cheia()) {
            vetor[fim] = elem;
            fim++;
            total++;
            if (fim >= tamanho)
                fim = 0;
        } else
            System.out.println("Fila Cheia");
    }

    public String desenfileirar() {
        String elem;
        if (!vazia()) {
            elem = String.valueOf(vetor[inicio]);
            System.out.println(elem);
            inicio++;
            if (inicio >= tamanho)
                inicio = 0;
            total--;
        } else
            elem = "Fila vazia";
        return elem;
    }

    public void exibeFila() {
        for (int i = inicio; i < fim; i++)
            System.out.println("posicao " + i + " valor " + vetor[i]);
    }

    public int getTamanho() {
        return tamanho;
    }
}
