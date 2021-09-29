/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6.exemplo1;

/**
 *
 * @author mauricio.moreira
 */
public class Teste {
    public static void main(String[] args) {
        Produto bola = new Bola("Bola genérica", 1);
        bola.atualizar("Bola Azul", 10.99f);
        bola.mostrarDados();
        
        Produto brinquedo = new Brinquedo("Boneco", 20);
        brinquedo.atualizar("Power Ranger", 45);
        brinquedo.mostrarDados();
    }
}
