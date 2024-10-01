package Semestre_2.POO.heranca.lojavirtual;

public class Main {

    public static void main(String[] args) {

        Alimento coxinha = new Alimento("Coxinha", 5.50, 10);
        Eletronico geladeiraIndustrial = new Eletronico("Geladeira Industrial", 4000.00, 1);
        Roupa tanga = new Roupa("Tanga", 19.99, 7);

        System.out.println(coxinha);
        System.out.println(geladeiraIndustrial);
        System.out.println(tanga);

        System.out.println();
        coxinha.consumir();
        geladeiraIndustrial.testar();
        tanga.experimentar();

        System.out.println(coxinha);
    }
}
