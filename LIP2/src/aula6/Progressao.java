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
public abstract class Progressao {
    protected int primeiro;
    protected int corrente;
    
    public Progressao() {
        primeiro = 0;
        corrente = 0;
    }
    public abstract int proximoValor();
    
    public void imprimirCorrente() {
        System.out.println("Valor: " + corrente);
    }
}
