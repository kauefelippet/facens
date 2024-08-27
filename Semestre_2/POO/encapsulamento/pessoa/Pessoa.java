package Semestre_2.POO.encapsulamento.pessoa;

public class Pessoa {

    private String nome;
    private int idade;
    private Endereco endereco;
    private Telefone telefone;

    public Pessoa(String nome, int idade, Telefone telefone, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void fazerAniversario() {
     this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return "Nome: " + this.nome + ", " + this.idade + " anos" +
                "\n" + this.telefone +
                "\nEndereço: " + this.endereco;
    }
}
