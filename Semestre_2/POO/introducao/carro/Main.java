package Semestre_2.POO.introducao.carro;

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Uno", 1.0, 1996);

        carro1.acelerar(false);
        carro1.acelerar(true);


        carro1.frear(0);
        carro1.frear(100);

    }
}
