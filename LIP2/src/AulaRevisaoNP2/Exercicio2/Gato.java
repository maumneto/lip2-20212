/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaRevisaoNP2.Exercicio2;

/**
 *
 * @author mauricio.moreira
 */
public class Gato extends Animal {
    @Override
    public String emitirSom() {
        return "Miau";
    }
    @Override
    public void mover() {
        System.out.println("Gato se movendo.");
    }
    @Override
    public void descansar() {
        System.out.println("Gato descansando.");
    }
}
