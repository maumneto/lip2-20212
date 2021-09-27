/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaNP1.questao8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mauricio.moreira
 */
public class Disciplina {
    public String nome;
    public String codigo;
    public int cargaHoraria;
    public List<Turma> turmas;

    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        cargaHoraria = 80;
        turmas = new ArrayList<>();
    }
    public String getCodigo() {
        return this.codigo;
    }
    public String getNomeDisciplina() {
        return this.nome;
    }
    public void adicionarTurma(Turma t) {
        this.turmas.add(t);
    }
    
}
