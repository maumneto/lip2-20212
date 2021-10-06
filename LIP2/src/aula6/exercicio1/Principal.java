/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6.exercicio1;

/**
 *
 * @author mauricio.moreira
 */
public class Principal {
    public static void main(String[] args){
    Adestrador adestrador = new Adestrador();
        for (int i = 0; i < 10; i++) {
            Animal animal = adestrador.adestrarAnimal();
            adestrador.brincar(animal);
        }
    }
}
