package Semestre_2.POO.polimorfismo.documento;

public class Word extends Arquivo {

    Word(String nome) {
        super(nome);
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo DOCX: " + this.getNome());
    }
}
