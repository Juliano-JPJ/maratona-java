package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{6, 7, 8, 9, 10};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);

        }

        for (int j = 0; j < numeros3.length; j++) {
            System.out.println(numeros3[j]);
        }

        for (int num:numeros) { //for each
            System.out.println(num);
        }
    }
}
