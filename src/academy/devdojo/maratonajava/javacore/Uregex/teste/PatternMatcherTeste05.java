package academy.devdojo.maratonajava.javacore.Uregex.teste;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste05 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for dígito
        // \s = Todos os espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-z, A-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
        // [] = range
        // ? = Zero ou uma
        // * = Zero ou mais
        // + = Uma ou mais
        // {n,m} =  de n até m
        // () = agrupamento
        // | = o(v|c)o -> ovo | oco
        // $ = fim da linha
        // . = 1.3 -> 123, 133, 1@3, 1A3


        String regex = "([a-z\\d\\._-])+@([a-z])+(\\.([a-z])+)+";
        String texto = "ciclano@hotmail.com, fulano123@gmail.com, #@!beltrano@mail.br, teste@gmail.com.br, joaozinho@mail";
        System.out.print("Email válido: ");
        System.out.println("#@!beltrano@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("índice: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Posições encontradas: ");
        while(matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
//        int numeroHex = 0x59F86A;
//        System.out.println(numeroHex);
    }
}
