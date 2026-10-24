package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int c = 1;
        while (c <=10) {
            System.out.println(c);
            c++;
        }

        do {
            System.out.println("Dentro do do-while");
            c++;
        } while (c < 10);

        for(int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
