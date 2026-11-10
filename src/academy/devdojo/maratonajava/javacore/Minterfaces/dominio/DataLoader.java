package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    int MAX_DATA_SIZE = 10; // padrão public static final

    void carregar(); // padrão public abstract

    default void checarPermissao() {
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDatSize() {
        System.out.println("Dentro do retrieveMaxDatSize na interface");
    }
}
