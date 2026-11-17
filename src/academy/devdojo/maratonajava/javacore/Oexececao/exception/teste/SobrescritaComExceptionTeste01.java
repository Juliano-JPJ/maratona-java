package academy.devdojo.maratonajava.javacore.Oexececao.exception.teste;

import academy.devdojo.maratonajava.javacore.Oexececao.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexececao.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexececao.exception.dominio.Pessoa;


public class SobrescritaComExceptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
