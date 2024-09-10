package Semestre_2.POO.sobrecarga_metodos.exercicio1;

/*
Crie uma classe Conversor com três métodos chamados converter.
O primeiro deve converter metros em centímetros, o segundo deve converter horas em minutos,
e o terceiro deve converter dias em horas. Utilize sobrecarga para implementar os três métodos.
 */

class Conversor {

    public double converter(double metros)  {
        return metros*100;
    }

    public int converter(int horas) {
        return horas*60;
    }

    public float converter(float dias) {
        return dias*24;
    }
}
