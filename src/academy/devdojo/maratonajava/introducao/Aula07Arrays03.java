package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {4, 5, 6, 7, 8};
        int[] numeros3 = new int[]{9, 10, 11, 12, 13};

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }

        for (int i:numeros3) {
            System.out.println(i);
        }
    }
}
