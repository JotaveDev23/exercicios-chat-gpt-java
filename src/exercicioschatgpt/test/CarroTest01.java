package exercicioschatgpt.test;

import exercicioschatgpt.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla");
        Carro carro1 = new Carro("Honda", "Civic");
        Carro carro2 = new Carro("Fiat", "Uno");

        carro.setAno(2022);
        carro1.setAno(2020);
        carro2.setAno(2023);


        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo() + " " + carro.getAno());
        System.out.println("Carro: " + carro1.getMarca() + " " + carro1.getModelo() + " " + carro1.getAno());
        System.out.println("Carro: " + carro2.getMarca() + " " + carro2.getModelo() + " " + carro2.getAno());

    }
}
