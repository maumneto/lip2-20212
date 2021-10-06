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
public class ContaCorrenteEspecial extends ContaCorrente {
    public ContaCorrenteEspecial(String nome) {
        super(nome);
    }
    public ContaCorrenteEspecial(String nome, double montante) {
        super(nome, montante);
    }
    @Override
    public void sacar(double quantia) {
        if (montante < (quantia + quantia*0.01)) {
            System.out.println("Não a saldo o suficiente!");
        } else {
            montante = montante - quantia - quantia*0.01;
        }
    }
}
