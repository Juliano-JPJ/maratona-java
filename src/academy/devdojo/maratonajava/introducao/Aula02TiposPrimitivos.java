package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'A';
        String nome = "Roberto Soares da Silva"; //Não é um Tipo Primitivo, é uma Classe ou Tipo de Referência
        System.out.println("A idade é " + idade + " anos.");
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println("Olá, meu nome é " + nome);
    }
}
