/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3.exercicio4;

/**
 *
 * @author newaccount
 */
public class Estudante {
    public String nome;
    public String matricula;
    public Curso curso;

    public Estudante(String nome, String matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    
}
