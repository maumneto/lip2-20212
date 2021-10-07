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
public class Conta {
    private double saldo;
    // construtor
    public Conta() {
        this.saldo = 0;
    }
    // metodo setter
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    // metodo getter
    public double getSaldo() {
        return this.saldo;
    }
    
    public void depositar(double valor) {
        saldo = saldo + valor;
    }
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
        } else {
            System.out.println("Não é possível sacar essa quantia.");
        }
    }
    public void consultar() {
        System.out.println("Saldo: " + this.getSaldo());
    }
}
