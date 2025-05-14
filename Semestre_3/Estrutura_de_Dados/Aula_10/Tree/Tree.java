/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semestre_3.Estrutura_de_Dados.Aula_10.Tree;

/**
 * @author bruno
 */
public class Tree {
    private Node root = null;
    private int qtde = 0;// Nó pai, ou raíz

    public boolean vazia(Node place) {
        return place == null;
    }

    public void insert(int info, Node place) {             // algoritmo para inserir uma informação
        if (place == null) {                        // Se o local está vazio, então a árvore está vazia
            root = new Node(info);                  // e o root vai receber o novo nó
            System.out.print(" " + info);           // Imprime a informação inserida
        } else if (info < place.info) {             // Senão, se a informação é menor do que a do local
            if (place.left == null) {               // Se o filho da esquerda está vazio
                place.left = new Node(info);        // Então insere à esquerda o novo nó
                System.out.print(" " + info);       // Imprime a informação inserida
            } else {                                // São, se não for vazio
                insert(info, place.left);           // Pula para o filho à esquerda usando a recursividade
            }
        } else if (info > place.info) {             // Senão, se a informação é maior que a do local
            if (place.right == null) {              // Se o filho à direita está vazio
                place.right = new Node(info);       // Insere a informação em um novo nó à direita
                System.out.print(" " + info);       // e imprime a informação
            } else {                                // Senão, se o nó à direita não está vazio
                insert(info, place.right);          // Pula para o filho à direita usando a recursividade
            }
        }
    }

    public String preOrder(Node place) { // Algoritmo de navegação em ordem
        if (place == null) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        result.append(" ").append(place.info); // Adiciona a informação do nó
        result.append(preOrder(place.left)); // Pula para o filho à esquerda pela recursividade
        result.append(preOrder(place.right)); // Pula para o filho à direita pela recursividade
        return result.toString();
    }

public String inOrder(Node place) { // Algoritmo de navegação em ordem
    if (place == null) {
        return "";
    }
    StringBuilder result = new StringBuilder();
    result.append(inOrder(place.left)); // Pula para o filho à esquerda pela recursividade
    result.append(" ").append(place.info); // Adiciona a informação do nó
    result.append(inOrder(place.right)); // Pula para o filho à direita pela recursividade
    return result.toString();
}

    public String postOrder(Node place) { // Algoritmo de navegação em ordem
        if (place == null) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        result.append(postOrder(place.left)); // Pula para o filho à esquerda pela recursividade
        result.append(postOrder(place.right)); // Pula para o filho à direita pela recursividade
        result.append(" ").append(place.info); // Adiciona a informação do nó
        return result.toString();
    }

    public int qtdeElementos(Node place) {
        qtde++;
        // Algoritmo de navegação em ordem
        if (place.left != null) {                   // Se o filho à esquerda não está vazio
            qtdeElementos(place.left);                    // Pula para o filho à esquerda pela recursividade
        }
        // Depois imprime a informação do nó
        if (place.right != null) {                  // Se filho à direita não está vazio
            qtdeElementos(place.right);                   // Pula para o filho à direita pela recursividade
        }
        return (qtde);
    }

    public boolean search(int info, Node place) {
        if (place == null) {
            return false;
        } else if (place.info == info) {
            return true;
        } else if (info < place.info) {
            return search(info, place.left);
        } else {
            return search(info, place.right);
        }
    }

    public int count(Node place) {
        if (place == null) {
            return 0;
        } else {
            return 1 + count(place.left) + count(place.right);
        }
    }

public void remove(int info, Node place) {
    root = removeRecursive(root, info);
}

private Node removeRecursive(Node place, int info) {
    if (place == null) {
        return null; // Base case: element not found
    }

    if (info < place.info) {
        // Traverse left subtree
        place.left = removeRecursive(place.left, info);
    } else if (info > place.info) {
        // Traverse right subtree
        place.right = removeRecursive(place.right, info);
    } else {
        // Node to be removed found
        if (place.left == null && place.right == null) {
            // Case 1: No children (leaf node)
            return null;
        } else if (place.left == null) {
            // Case 2: One child (right child)
            return place.right;
        } else if (place.right == null) {
            // Case 2: One child (left child)
            return place.left;
        } else {
            // Case 3: Two children
            // Find in-order successor (smallest value in the right subtree)
            Node successor = findMin(place.right);
            place.info = successor.info; // Replace current node's value with successor's value
            place.right = removeRecursive(place.right, successor.info); // Remove successor
        }
    }
    return place;
}

private Node findMin(Node place) {
    while (place.left != null) {
        place = place.left; // Traverse to the leftmost node
    }
    return place;
}

    public Node getRoot() {
        return root;
    }
}
