package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // €0 e €34.712           9.70%
        // €34.713 e €68.507     37.35%
        // €68.508               49.50%

        //MEU EXERCÍCIO
        double salarioAnual = 45000;
        double imposto;
        if (salarioAnual <= 34712) {
            imposto = salarioAnual * 0.097;
        } else if (salarioAnual <= 68507) {
            imposto = salarioAnual * 0.3735;
        } else {
            imposto = salarioAnual * 0.495;
        }
        System.out.println("O imposto será de €" + imposto);

        //EXECÍCIO DO PROFESSOR
        double salarioAno = 45000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAno <= 34712) {
            valorImposto = salarioAno * primeiraFaixa;
        } else if (salarioAno >= 34713 && salarioAno <= 68507) {
            valorImposto = salarioAno *( segundaFaixa);
        } else {
            valorImposto = salarioAno * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
