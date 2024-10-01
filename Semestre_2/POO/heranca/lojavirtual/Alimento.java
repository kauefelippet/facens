package Semestre_2.POO.heranca.lojavirtual;

public class Alimento extends Produto {

    public Alimento(String nome, double preco, int estoque) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setEstoque(estoque);
    }

    public void consumir() {
        System.out.println("Consumindo " + this.getNome());
        this.setEstoque(this.getEstoque()-1);
    }
}
