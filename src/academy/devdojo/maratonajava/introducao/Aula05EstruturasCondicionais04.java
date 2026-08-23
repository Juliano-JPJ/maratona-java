package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        //Eu quero saber quanto imposto eu pagaria nos Países Baixos em 2020 baseado no meu salário anual
        //€ 0 - € 34,712          9.70%
        //€ 34,713 - € 68,507     37.35%
        //€ 68,508                49.50%

        //MINHA RESOLUÇÃO
        double salarioAnual = 65000;
        double imposto;
        if (salarioAnual <= 34712) {
            imposto = salarioAnual * 0.097;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            imposto = salarioAnual * 0.3735;
        } else {
            imposto = salarioAnual * 0.495;
        }
        System.out.println(imposto);

        //RESOLUÇÃO PROFESSOR
        double salarioAnual2 = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if(salarioAnual2 <= 34712) {
            valorImposto = salarioAnual2 * primeiraFaixa;
        } else if (salarioAnual2 >= 34713 && salarioAnual2 <= 68507) {
            valorImposto = salarioAnual2 * segundaFaixa;
        } else {
            valorImposto = salarioAnual2 * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
