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
public class Teste {
    public static void main(String[] args) {
        Progressao p = new Aritmetica(10);
        Aritmetica arit = new Aritmetica(10);
        arit.proximoValor();
        arit.imprimirCorrente();
        p.proximoValor();
    }
}
