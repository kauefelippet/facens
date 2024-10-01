package Semestre_2.POO.heranca.lojavirtual;

public class Roupa extends Produto {

    public Roupa(String nome, double preco, int estoque) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setEstoque(estoque);
    }

    public void experimentar() {
        System.out.println("Experimentando " + this.getNome());
    }
}
