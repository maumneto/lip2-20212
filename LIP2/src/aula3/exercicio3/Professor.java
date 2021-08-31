/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3.exercicio3;

import java.util.List;
import java.util.ArrayList;

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
    public int getId() {
        return this.id;
    }
    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
    public void showDisciplinas() {
        for (Disciplina d : disciplinas) {
            System.out.println(d.getNomeDisciplina());
        }
    }
    
}
