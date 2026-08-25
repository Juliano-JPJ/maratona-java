package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Toyota";
        carro.modelo = "Corolla XEi";
        carro.ano = 2022;

        carro2.nome = "Volkswagen";
        carro2.modelo = "Gol Trend";
        carro2.ano = 2014;

        System.out.println("Carro 1: " + carro.nome + ". Modelo: " + carro.modelo + ". Ano: " + carro.ano);
        System.out.println("Carro 2: " + carro2.nome + ". Modelo: " + carro2.modelo + ". Ano: " + carro2.ano);
    }
}
