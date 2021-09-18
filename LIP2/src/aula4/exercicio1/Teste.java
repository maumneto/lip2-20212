/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4.exercicio1;

/**
 *
 * @author mauricio.moreira
 */
class Animal {
    public void comer() {
        System.out.println("Animal comendo...");
    }
}

class Gato extends Animal {
    @Override
    public void comer() {
        System.out.println("gato comendo...");
    }
}

public class Teste {
    public static void main(String[] args) {
        Gato cat = new Gato();
        cat.comer();
        ((Animal) cat).comer();
    }
}
