/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3.exercicio2;

/**
 *
 * @author newaccount
 */
public class Disciplina {
    public String nome;
    public int codigo;
    public Professor professor;
    
    public Disciplina(String nome, int codigo, Professor professor) {
        this.nome = nome;
        this.codigo = codigo;
        this.professor = professor;
    }
    public String getNomeDisciplina() {
        return this.nome;
    }
    public int getCodigoDisciplina() {
        return this.codigo;
    }
}
