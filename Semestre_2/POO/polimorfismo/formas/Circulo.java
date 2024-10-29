package Semestre_2.POO.polimorfismo.formas;


public class Circulo extends Forma implements InterfaceBrincavel{

    private double raio;
    private String materialDeFabricacao;
    private int idadeMinima;

    public Circulo(String nome, double raio, String materialDeFabricacao, 
                    int idadeMinima) {
        super(nome);
        this.raio = raio;
        this.materialDeFabricacao = materialDeFabricacao;
        this.idadeMinima = idadeMinima;
    }
   

    @Override
    public double calcularArea() {
        return Helpers.PI * raio * raio;
    }



    public double getRaio() {
        return raio;
    }



    public void setRaio(double raio) {
        this.raio = raio;
    }


    @Override
    public String toString() {
        return "Circulo [raio=" + raio + ", Nome =" + getNome() + "]";
    }


    @Override
    public String retornaMaterial() {
        return this.materialDeFabricacao;        
    }


    @Override
    public void brincar() {
        System.out.println("Brincando com " + super.getNome() + 
                            " que eh feito de " + this.materialDeFabricacao);
    }


    @Override
    public int idadeMinima() {
        return this.idadeMinima;
    }

    
    
}
