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
public class Aritmetica extends Progressao {
    
    private int incremento;

    public Aritmetica(int incremento) {
        this.incremento = incremento;
    }
    
    @Override
    public int proximoValor() {
        corrente = corrente + incremento;
        System.out.println(corrente);
        return corrente;
    }
    
}
