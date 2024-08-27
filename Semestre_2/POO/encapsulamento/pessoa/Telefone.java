package Semestre_2.POO.encapsulamento.pessoa;

public class Telefone {

    private String tipoTelefone;
    private int ddd;
    private String numero;

    public Telefone(String tipoTelefone, int ddd, String numero) {
        this.tipoTelefone = tipoTelefone;
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String toString() {
        return "Telefone: " + this.tipoTelefone + " - (" + this.ddd + ") " + this.numero;
    }
}
