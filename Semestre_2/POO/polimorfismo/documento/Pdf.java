package Semestre_2.POO.polimorfismo.documento;

public class Pdf extends Arquivo {

    Pdf(String nome) {
        super(nome);
    }

    @Override
    public void abrir() {
        System.out.println("Abrindo PDF: " + this.getNome());
    }
}
