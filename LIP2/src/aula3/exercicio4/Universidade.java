/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3.exercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author newaccount
 */
public class Universidade {
    public String nomeUniversidade;
    public String descricao;
    public List<Curso> cursos = null;
    
    public Universidade(String nomeUniversidade, String descricao) {
        this.nomeUniversidade = nomeUniversidade;
        this.descricao = descricao;
        cursos = new ArrayList<>();
    }
    public String getNomeUniversidade() {
        return this.nomeUniversidade;
    }
    public void getNomeCursos() {
        for(Curso c: cursos) {
            System.out.println(c.getNomeCurso());
        }
    }
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    public int getTotalCursos() {
        return cursos.size();
    }
    public int getTotalEstudantesUniversidade() {
        int totalAlunos = 0;
        List<Estudante> estudantes = null;
        for (Curso c : cursos) {
            estudantes = c.getEstudantes();
            for (Estudante e: estudantes) {
                totalAlunos++;
            }
        }
        return totalAlunos;
    }
    
}
