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
public class Cachorro extends Animal {
    @Override
    public String emitirSom() {
        return "Cachorro latindo...";
    }
    @Override
    public void mover() {
        System.out.println("O cachorro está se movendo...");
    }
    @Override
    public void descansar() {
        System.out.println("O cachorro está descansando...");
    }
}
