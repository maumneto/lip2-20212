/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3.exercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author newaccount
 */
public class Professor {
    public String nome;
    public int id;
    List<Disciplina> disciplinas = new ArrayList<Disciplina>();
    
    public Professor(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    public String getNomeProfessor() {
        return this.nome;
    }
    public int getIde(){
        return this.id;
    }
    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
    public int getTotalDisciplinas() {
        int total = 0;
        for (Disciplina d : disciplinas) {
           total++;
        }
        return total;
    }
    public void getNomeDisciplinas() {
        for (Disciplina d : disciplinas) {
            System.out.println("Disciplina: " + d.getNomeDisciplina());
        }
    }
    
}
