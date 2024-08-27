package Semestre_2.POO.encapsulamento.pessoa;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("P1", 35, new Telefone("Fixo", 11, "91234-5678"), new Endereco("Rua Um", "13300-000", 55));

        System.out.println(pessoa1);

        pessoa1.getTelefone().setTipoTelefone("Residencial");
        pessoa1.fazerAniversario();

        System.out.println("\n" + pessoa1);
    }
}
