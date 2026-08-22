package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        // IF
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        } else {
            System.out.println("Não autorizado a comprSar bebida alcólica");
        }

        if(!isAutorizadoComprarBebida) { // ! (NOT)
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
    }
}
