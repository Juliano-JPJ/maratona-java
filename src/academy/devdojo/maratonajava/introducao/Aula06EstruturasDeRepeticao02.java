package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 100

        //MEU EXERCÍCIO
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }

        //EXERCÍCIO DO PROFESSOR
        for (int j = 0; j <= 100; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
    }
}
