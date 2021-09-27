/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaNP1.questao8;

/**
 *
 * @author mauricio.moreira
 */
public class Turma {
    public String id;
    public int semestre;
    public Disciplina disciplina;

    public Turma(String id, int semestre, Disciplina disciplina) {
        this.id = id;
        this.semestre = semestre;
        this.disciplina = disciplina;
    }
    public String getId() {
        return this.id;
    }
    public int getSemestre() {
        return this.semestre;
    }
}
