/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

public class Questao4 {
    public static void main(String[] args) {
        int n = 1, somaQuad = 0, quadSoma = 0, diff;
        while(n <= 10) {
            somaQuad = somaQuad + n*n;
            System.out.println(somaQuad);
            quadSoma = quadSoma + n;
            System.out.println(quadSoma);
            n++;
        }
        quadSoma = quadSoma*quadSoma;
        System.out.println("A soma dos quadrados: " + somaQuad);
        System.out.println("O quadrado da soma: " + quadSoma);
        diff = quadSoma - somaQuad;
        System.out.println("Diferenca: " + diff);
    }
}
