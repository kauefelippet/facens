package Semestre_2.POO.polimorfismo.formas;

public class Retangulo extends Forma{

    private double altura;
    private double largura;

    public Retangulo(double largura, double altura, String nome){
        super(nome);

        if(largura != altura){
            this.altura = altura;
            this.largura = largura;
        }else{
            System.out.println("Voce esta definindo um quadrado");
        }        
    }

    public double calcularArea(){
        return this.largura * this.altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    
    
}
