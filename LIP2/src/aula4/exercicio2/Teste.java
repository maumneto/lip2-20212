/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4.exercicio2;

/**
 *
 * @author mauricio.moreira
 */
public class Teste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(1000, 0, "Fulano");
        System.out.println(gerente.salario);
        System.out.println(gerente.dependentes);
        System.out.println(gerente.nomeSecretario);
    }
}
