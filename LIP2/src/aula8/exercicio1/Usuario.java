/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8.exercicio1;

/**
 *
 * @author mauricio.moreira
 */
public class Usuario {
    public static int id = 0;

    public Usuario() {
        Usuario.incrementar();
    }
    
    private static void incrementar() {
        id++;
    }
    public int getId() {
        return id;
    }
}
