/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaRevisaoNP2.Exercicio2;

import java.util.Random;

/**
 *
 * @author mauricio.moreira
 */
public class Adestrador {
    public Animal adestrarAnimal() {
        Animal cat = new Gato();
        Animal dog = new Cachorro();
        Random rand = new Random();
        Animal animais[] = {cat, dog};
        return animais[rand.nextInt(animais.length)];
    }
    public void brincar(Animal animal) {
        System.out.println(animal.emitirSom());
    }
}
