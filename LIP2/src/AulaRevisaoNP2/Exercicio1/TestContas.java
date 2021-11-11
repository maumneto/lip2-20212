/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaRevisaoNP2.Exercicio1;

/**
 *
 * @author mauricio.moreira
 */
public class TestContas {
    public static void main(String[] args) {
        ContaBancaria primeiraConta = new ContaBancaria(100, "Mauricio");
        primeiraConta.depositar(300);
        primeiraConta.sacar(100);
        System.out.println("Nome: " + primeiraConta.getNome());
        System.out.println("Saldo: " + primeiraConta.saldo());
        
        ContaCorrenteEspecial contaEspecial = new ContaCorrenteEspecial(100, "Fulano");
        contaEspecial.depositar(300);
        contaEspecial.sacar(100);
        System.out.println("Nome: " + contaEspecial.getNome());
        System.out.println("Saldo: " + contaEspecial.saldo());
    }
}
