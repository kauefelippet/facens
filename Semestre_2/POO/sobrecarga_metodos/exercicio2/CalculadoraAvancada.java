package Semestre_2.POO.sobrecarga_metodos.exercicio2;

/*
Crie uma classe CalculadoraAvancada que contenha três métodos
chamados potencia. O primeiro metodo deve calcular a potência de
um número inteiro, o segundo deve calcular a potência de um
número decimal, e o terceiro deve calcular a potência de um número
com expoente inteiro negativo. Use sobrecarga para esses métodos.
 */

class CalculadoraAvancada {

    public double potencia(double base, int expoenteDecimal) {
        double resultado = 1;
        for (int i = 0; i < expoenteDecimal; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public double potencia(int base, double expoenteNegativo) {
        int resultado = 1;
        for (int i = 0; i < (-expoenteNegativo); i++) {
            resultado *= base;
        }
        return 1.0 / resultado;
    }

    public int potencia(int base, int expoenteInteiro) {
        int resultado = 1;
        for (int i = 0; i < expoenteInteiro; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
