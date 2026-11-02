package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das Palmeiras, 444, Bairro Liberdade, Florianópolis");
        Aluno aluno = new Aluno("Pedro", 17);
        Aluno[] alunos = {aluno};
        Seminario seminario = new Seminario("Psicologia Clínica", local, alunos);
        Seminario[] seminarios = {seminario};
        Professor professor = new Professor("João", "Matemática", seminarios);


        professor.imprime();
    }
}
