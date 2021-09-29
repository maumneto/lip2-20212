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
public class CalculadoraSimples implements Calculos {
    @Override
    public double somar(double a, double b) {
        return a + b;
    }
    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }
    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }
    @Override
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Não há divisão por zero");
            return -1;
        } else {
            return a / b;
        }
    }
}
