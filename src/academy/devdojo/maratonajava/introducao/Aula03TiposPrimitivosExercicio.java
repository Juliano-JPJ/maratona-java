package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu, <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>.
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Fernando Almeida";
        String endereco = "R. 1500, n. 356, ap. 201, Centro, Itajaí";
        double salario = 4506.37;
        String data = "21/10/2026";

        System.out.println("Eu, " + nome + ", morando no endereço " + endereco
        + ", confirmo que recebi o salário de R$" + salario + ", na data " + data);

    }
}
