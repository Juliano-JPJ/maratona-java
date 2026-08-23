package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // WHILE, DO WHILE, FOR
        int count = 0;
        while(count < 10) {
            System.out.println(count);
            count++;
        }

        int c = 12;
        do {
            System.out.println("Dentro do do-while"); //Executa pelo menos 1 vez, mesmo que o código seja false
            c++;
        } while (c < 10);


        for(int i=0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
