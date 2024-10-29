package Semestre_2.POO.polimorfismo.formas;

public class Main{
    // Classe Abstrata de Forma Geométrica: Crie uma classe abstrata Forma com um 
    // método abstrato calcularArea(). Crie classes concretas Circulo e Retangulo que 
    // herdam de Forma e implementam o método calcularArea(). Escreva um programa para 
    // calcular a área de diferentes formas.

    public static void main(String[] args) {

        // System.out.println("Exemplo correcao exercicio");

        // Circulo c = new Circulo("Circunferencia Generica", 2);
        // System.out.println("Area circulo: " + c.calcularArea());
        // System.out.println(c);

        // Retangulo r = new Retangulo(2, 2, "Retangulo generico");
        // double areaRetangulo = r.calcularArea();
        // System.out.println("Area retangulo: " + areaRetangulo);
        // System.out.println(r);

        System.out.println("Exemplos polimorfismo");

        Forma f = new Retangulo(2, 
                                4, 
                                "Retoangulo polimorfico");

        double areaF = f.calcularArea();
        System.out.println(f.getClass());

        Retangulo r2 = (Retangulo) f;
        System.out.println(r2.getAltura());

        Forma f2 = (Forma) r2;

        Forma f3 = new Circulo("Circulo polimorfico", 3, 
                                "Plastico", 1);
        Circulo c2 = (Circulo) f3;
        InterfaceBrincavel i1 = (InterfaceBrincavel) c2;
        i1.brincar();

        Forma f4 = new Circulo2("Circulo 2", 3, 
                                "Plastico", 0);
        Circulo c3 = new Circulo2("Circulo 2", 3, 
                                    "Plastico", 0);
        InterfaceBrincavel i2 = new Circulo2("Circulo 2", 3, 
                                    "Plastico", 0);   
        Object o = new Circulo2("Circulo 2", 3, 
                                "Plastico", 0);       
    }
}