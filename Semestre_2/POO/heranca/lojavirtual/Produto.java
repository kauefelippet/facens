package Semestre_2.POO.heranca.lojavirtual;

public abstract class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "\nProduto:" +
                "\nNome: " + nome +
                "\nPreço: R$" + preco +
                "\nEstoque: " + estoque;
    }
}
