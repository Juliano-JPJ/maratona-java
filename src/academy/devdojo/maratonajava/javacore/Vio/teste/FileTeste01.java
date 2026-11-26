package academy.devdojo.maratonajava.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreated);
            System.out.println("Path: " + file.getPath());
            System.out.println("Path absoluto: " + file.getAbsolutePath());
            System.out.println("É um diretório: " + file.isDirectory());
            System.out.println("É um arquivo: " + file.isFile());
            System.out.println("É um arquivo oculto: " + file.isHidden());
            System.out.println("Ultima modificação: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
            boolean exists = file.exists();
            if (exists) {
                System.out.println("Arquivo deletado: " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
