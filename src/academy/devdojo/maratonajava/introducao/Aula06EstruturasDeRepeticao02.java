package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000

        //MINHA RESOLUÇÃO
        for (int i=0; i <= 1000; i += 2) {
            System.out.println(i);
        }

        //RESOLUÇÃO PROFESSOR
        for (int j = 0; j <= 1000; j++) {
            if(j % 2 == 0) {
                System.out.println(j);
            }
        }
    }
}
