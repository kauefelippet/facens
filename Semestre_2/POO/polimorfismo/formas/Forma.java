package Semestre_2.POO.polimorfismo.formas;

public abstract class Forma extends Object {

    private String nome;

    public Forma(String nome){
        this.nome = nome;
    }    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();

    @Override
    public String toString() {
        return "Esta é uma Forma []";
    }

    
    
}
