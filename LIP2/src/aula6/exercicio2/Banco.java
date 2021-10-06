/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6.exercicio2;

/**
 *
 * @author mauricio.moreira
 */
public class Banco {
    public static void main(String[] args) {
        ContaCorrente conta_mauricio = new ContaCorrente("Mauricio", 100);
        conta_mauricio.depositar(300);
        conta_mauricio.sacar(250);
        conta_mauricio.sacar(250);
        System.out.println("Nome: " + conta_mauricio.getNome());
        System.out.println("ID: " + conta_mauricio.getId());
        System.out.println("Saldo: " + conta_mauricio.saldo());
        
        System.out.println("----------------------------------------");
        
        ContaCorrenteEspecial conta_premium = new ContaCorrenteEspecial("Fulano de Tal", 100);
        conta_premium.depositar(300);
        conta_premium.sacar(250);
        conta_premium.sacar(250);
        System.out.println("Nome: " + conta_premium.getNome());
        System.out.println("ID: " + conta_premium.getId());
        System.out.println("Saldo: " + conta_premium.saldo());
    }
}
