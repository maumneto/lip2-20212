/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6.exercicio1;

import java.util.Random;

/**
 *
 * @author mauricio.moreira
 */
public class Adestrador {
    public Animal adestrarAnimal() {
        Gato cat = new Gato();
        Cachorro dog = new Cachorro();
        Random random = new Random();
        Animal animais[] = {cat, dog};
        return animais[random.nextInt(animais.length)];
    }
    public void brincar(Animal animal) {
        System.out.println(animal.emitirSom());
    }
}
