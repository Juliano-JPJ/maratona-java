package academy.devdojo.maratonajava.javacore.Minterfaces.teste;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.carregar();
        dataBaseLoader.remover();
        dataBaseLoader.checarPermissao();

        fileLoader.carregar();
        fileLoader.remover();
        fileLoader.checarPermissao();

        DataLoader.retrieveMaxDatSize();
        DataBaseLoader.retrieveMaxDatSize();
    }
}
