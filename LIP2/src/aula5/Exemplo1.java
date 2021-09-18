/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author mauricio.moreira
 */
class Veiculo {
    public void frear() {
        System.out.println("Veiculo freando...");
    }
    public void acelerar() {
        System.out.println("Veiculo acelerando...");
    }
}

class Carro extends Veiculo {
    @Override
    public void frear() {
        System.out.println("Carro freando...");
    }
    @Override
    public void acelerar() {
        System.out.println("Carro acelerando...");
    }
}

class Caminhao extends Veiculo {
    @Override
    public void frear() {
        System.out.println("Caminhao freando...");
    }
    @Override
    public void acelerar() {
        System.out.println("caminhao acelerando...");
    }
}

class Moto extends Veiculo {
    @Override
    public void frear() {
        System.out.println("Moto freando...");
    }
    @Override
    public void acelerar() {
        System.out.println("Moto acelerando...");
    }
}

public class Exemplo1 {
    public static void main(String[] args) {
        Veiculo v1 = new Carro();
        v1.acelerar();
        v1.frear();
        Veiculo v2 = new Caminhao();
        v2.acelerar();
        v2.frear();
        Veiculo v3 = new Moto();
        v3.acelerar();
        v3.frear();
    }
}
