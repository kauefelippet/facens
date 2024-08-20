package Semestre_2.POO.introducao.carro;

public class Carro {

    private String modelo;
    private double motor;
    private int anoFabricacao;

    public Carro(String modelo, double motor, int anoFabricacao) {
        this.modelo = modelo;
        this.motor = motor;
        this.anoFabricacao = anoFabricacao;
    }

    public void acelerar(boolean estaLigado) {
        if (estaLigado) {
            System.out.println("Vrumm");
        } else {
            System.out.println("Carro desligado...");
        }
    }

    public boolean frear(float velocidade) {
        if (velocidade == 0) {
            System.out.println("Carro parado.");
            return false;
        } else {
            System.out.println("Freando...");
            return true;
        }
    }

}
