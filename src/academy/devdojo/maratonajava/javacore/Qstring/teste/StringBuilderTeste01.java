package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat(" DevDojo");
        System.out.println(nome);
        nome = nome.substring(0,3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo").append(" Academy");

        System.out.println(sb);
        System.out.println(sb.reverse());
        sb.reverse();
        System.out.println(sb.delete(0,3));
    }
}
