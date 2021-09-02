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
public class Curso {
    public String nomeCurso;
    public int codigo;
    public List<Estudante> estudantes = null;
    public Universidade universidade;

    public Curso(String nomeCurso, int Codigo, Universidade universidade) {
        this.nomeCurso = nomeCurso;
        this.codigo = codigo;
        estudantes = new ArrayList<>();
        this.universidade = universidade;
    }
    public String getNomeCurso() {
        return this.nomeCurso;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public void addEstudantes(Estudante estudante) {
        estudantes.add(estudante);
    }
    public void showEstudantes() {
        for (Estudante e : estudantes) {
            System.out.println(e.nome);
        }
    }
    public List<Estudante> getEstudantes() {
        return this.estudantes;
    }
    
}
