/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7.exercicio1;

/**
 *
 * @author mauricio.moreira
 */
public class Teste {
    public static void main(String[] args) {
        Conta conta_mau = new Conta();
        conta_mau.consultar();
        conta_mau.depositar(1050);
        conta_mau.consultar();
        System.out.println("Saldo: " + conta_mau.getSaldo());
        conta_mau.sacar(800);
        conta_mau.consultar();
    }
}
