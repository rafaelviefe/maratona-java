package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.ano = 2016;
        carro1.modelo = "renault";
        carro1.nome = "logan";
        Carro carro2 = new Carro();
        carro2.ano = 2009;
        carro2.modelo = "ford";
        carro2.nome = "fiesta";
        System.out.println("Carro 1: " + carro1.ano + " " + carro1.modelo + " " + carro1.nome);
        System.out.println("Carro 2: " + carro2.ano + " " + carro2.modelo + " " + carro2.nome);

    }
}
