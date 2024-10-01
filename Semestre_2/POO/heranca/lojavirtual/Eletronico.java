package Semestre_2.POO.heranca.lojavirtual;

public class Eletronico extends Produto {

    public Eletronico(String nome, double preco, int estoque) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setEstoque(estoque);
    }

    public void testar() {
        System.out.println("Testando " + this.getNome());
    }
}
