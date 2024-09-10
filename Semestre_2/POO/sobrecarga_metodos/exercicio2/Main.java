package Semestre_2.POO.sobrecarga_metodos.exercicio2;

class Main {

    public static void main(String[] args) {

        CalculadoraAvancada calculadora = new CalculadoraAvancada();

        System.out.println(calculadora.potencia(2.5, 2));
        System.out.println(calculadora.potencia(2, -2.0));
        System.out.println(calculadora.potencia(2, 4));

    }
}