/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

/**
 *
 * @author mauricio.moreira
 */
public abstract class ExampleAbstractClass {
    public String nome;
    private int id;
    
    public void incremetar() {
        this.id++;
    }
    public abstract void testar();
}
