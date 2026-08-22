package academy.devdojo.maratonajava.introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>
*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Juliano";
        String endereco = "Rua Bucareste, Santa Regina, Camboriú";
        double salario = 4500.0;
        String data = "21/08/2026";

        System.out.println("Eu, " + nome + ", morando no endereço " + endereco + ", declaro de recebi o salário de R$" + salario + ", na data " + data + ".");

        String relatorio = "Eu, " + nome + ", morando no endereço " + endereco + ", declaro de recebi o salário de R$" + salario + ", na data " + data + ".";
        System.out.println(relatorio);
    }
}
