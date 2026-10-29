package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Fernando";
        funcionario.idade = 37;
        funcionario.salarios = new double[3];
        funcionario.salarios[0] = 1200;
        funcionario.salarios[1] = 987.32;
        funcionario.salarios[2] = 2000;

        funcionario.imprime();
    }
}
