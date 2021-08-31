/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3.exercicio1;

/**
 *
 * @author newaccount
 */
public class Professor {
    public String nome;
    public int id;
    public Disciplina disciplina;

    public Professor(String nome, int id, Disciplina disciplina) {
        this.nome = nome;
        this.id = id;
        this.disciplina = disciplina;
    }
}
