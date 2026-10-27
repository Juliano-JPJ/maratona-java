package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        //Crie uma classe carro1 com os seguintes atributos: Nome; Modelo; Ano
        //Em seguida, crie dois objetos distintos e imprima seus valores

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.nome = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;

        carro2.nome = "Volkswagen";
        carro2.modelo = "Gol";
        carro2.ano = 2022;

        carro3 = carro2;

        System.out.println("Carro 1: " + carro1.nome + ". Modelo: " + carro1.modelo + ". Ano: " + carro1.ano);
        System.out.println("Carro 2: " + carro2.nome + ". Modelo: " + carro2.modelo + ". Ano: " + carro2.ano);
        System.out.println("Carro 3: " + carro3.nome + ". Modelo: " + carro3.modelo + ". Ano: " + carro3.ano);
    }
}
