/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semestre_3.Estrutura_de_Dados.Aula_07.DoublyLinkedList;

/**
 * @author bruno
 */
public class ListaDupla {
    private NoDuplo primeiro, ultimo;
    private int numero_nos;

    ListaDupla() {
        primeiro = ultimo = null;
        numero_nos = 0;
    }

    public void insereNo(NoDuplo novoNo) {
        novoNo.prox = null;
        novoNo.ant = ultimo;
        if (primeiro == null)
            primeiro = novoNo;
        if (ultimo != null)
            ultimo.prox = novoNo;
        ultimo = novoNo;
        numero_nos++;
    }

    public NoDuplo pegarNo(int indice) {
        NoDuplo temp_no = primeiro;
        for (int i = 0; (i < indice) && (temp_no != null); i++) {
            temp_no = temp_no.prox;
        }
        return temp_no;
    }

    public NoDuplo buscarValorReverse(int valor) {
        NoDuplo temp_no = ultimo;
        while (temp_no != null) {
            if (temp_no.valor.equals(valor)) {
                return temp_no;
            }
            System.out.println(temp_no.valor);
            temp_no = temp_no.ant;
        }
        return null;
    }

    public void incluiNo(NoDuplo novoNo, int indice) {
        NoDuplo temp_no = pegarNo(indice);
        novoNo.prox = temp_no;
        if (novoNo.prox != null) {
            novoNo.ant = temp_no.ant;
            novoNo.prox.ant = novoNo;
        } else {
            novoNo.ant = ultimo;
            ultimo = novoNo;
        }
        if (indice == 0)
            primeiro = novoNo;
        else
            novoNo.ant.prox = novoNo;
        numero_nos++;
    }

    public void excluiNo(int indice) {
        if (indice == 0) {
            primeiro = primeiro.prox;
            if (primeiro != null)
                primeiro.ant = null;
        } else {
            NoDuplo temp_no = pegarNo(indice);
            temp_no.ant.prox = temp_no.prox;
            if (temp_no != ultimo) {
                temp_no.prox.ant = temp_no.ant;
            } else {
                ultimo = temp_no;
            }
        }
        numero_nos--;
    }

    public String exibeLista() {
        StringBuilder sb = new StringBuilder();
        NoDuplo temp_no = primeiro;
        while (temp_no != null) {
            sb.append(temp_no.valor.toString()).append("\n");
            temp_no = temp_no.prox;
        }
        return sb.toString();
    }

    public int getNumero_nos() {
        return numero_nos;
    }
}
