/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semestre_3.Estrutura_de_Dados.Aula_10.Tree;

/**
 *
 * @author bruno
 */
public class Node {
    public int info;                   // Informação tipo inteiro
    public Node left;                  // Filho à esquerda
    public Node right;                 // FIlho à direita
    Node(int info) {            // Inicializa os atributos da classe
        this.info = info;       // Inicializa a informação com o parâmetro recebido
        this.left = null;       // Inicializa o filho à esquerda como vazio
        this.right = null;      // Inicializa o filho à direita como vazio
    }
}
