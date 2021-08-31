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
public class Disciplina {
    public int codigo;
    public String nome;
    public Professor professor;
    
    public Disciplina(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    public String getNomeDisciplina() {
        return this.nome;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public String getNomeProfessor() {
        return this.professor.nome;
    }
    
}
