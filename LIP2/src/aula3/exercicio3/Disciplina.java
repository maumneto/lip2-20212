/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3.exercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author newaccount
 */
public class Disciplina {
    public String nome;
    public int codigo;
    List<Professor> professores = new ArrayList<Professor>();
    
    public Disciplina(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    public String getNomeDisciplina() {
        return this.nome;
    }
    public int getCodigoDisciplina() {
        return this.codigo;
    }
    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }
    public void showProfessors(){
        for (Professor p : professores) {
            System.out.println(p.getNomeProfessor());
        }
    }
}
