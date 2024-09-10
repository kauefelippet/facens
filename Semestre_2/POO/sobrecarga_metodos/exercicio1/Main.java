package Semestre_2.POO.sobrecarga_metodos.exercicio1;

class Main {

    public static void main(String[] args) {

        Conversor conversor = new Conversor();

        System.out.println("2 horas em minutos são iguais a " + conversor.converter(2) + " minutos.");
        System.out.println("13.75 metros em centímetros são iguais a " + conversor.converter(13.75) + " centímetros.");
        System.out.println("365.25 dias em horas são iguais a " + conversor.converter(365.25F) + " horas.");

    }
}
