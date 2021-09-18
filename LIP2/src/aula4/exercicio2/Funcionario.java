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
public class Funcionario {
    private String nome;
    public double salario;
    public int dependentes;

    public Funcionario(double salario, int dependentes) {
        this.salario = salario;
        this.dependentes = dependentes;
    }
}
