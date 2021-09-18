/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4.exercicio1;

/**
 *
 * @author mauricio.moreira
 */
public class CalculadoraSimples {
    public int somar(int a, int b) {
        return a + b;
    }
    public int somar(int... args) {
        int total = 0;
        for (int i : args) {
            total += i;
        }
        return total;
    }
    public double somar(double... args) {
        double total = 0;
        for (double i : args) {
            total += i;
        }
        return total;
    }
    public static void main(String[] args) {
        CalculadoraSimples calc = new CalculadoraSimples();
        System.out.println(calc.somar(1, 2));
        System.out.println(calc.somar(1,2,3,4,5,6));
        System.out.println(calc.somar(1,2,3.33,12,31));
                
    }
}
