/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6.exemplo2;

/**
 *
 * @author mauricio.moreira
 */
public class Teste {
    public static void main(String[] args) {
        CalculadoraSimples cs = new CalculadoraSimples();
        System.out.println(cs.multiplicar(10, 5));
        System.out.println(cs.somar(10, 5));
        System.out.println(cs.subtrair(10, 5));
        System.out.println(cs.dividir(10, 5));
    }
}
