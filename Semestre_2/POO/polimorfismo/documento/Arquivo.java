package Semestre_2.POO.polimorfismo.documento;

public abstract class Arquivo implements Documento {

    private String nome;

    Arquivo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
