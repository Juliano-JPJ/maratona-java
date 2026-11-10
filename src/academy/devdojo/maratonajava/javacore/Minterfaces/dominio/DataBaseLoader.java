package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {
    @Override
    public void carregar() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checarPermissao() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retrieveMaxDatSize() {
        System.out.println("Dentro do retrieveMaxDatSize na classe DataBaseLoader");
    }
}
