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
public class Gerente extends Funcionario {
    public String nomeSecretario;

    public Gerente(double salario, int dependentes, String nomeSecretario) {
        super(salario, dependentes);
        this.nomeSecretario = nomeSecretario;
    }
}
