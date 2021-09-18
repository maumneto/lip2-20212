/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4.resolucaolista1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mauricio.moreira
 */
public class Departamento {
    private int id;
    public String descricao;
    List<Pessoa> pessoas;

    public Departamento(int id) {
        this.id = id;
        pessoas = new ArrayList<>();
    }
    protected int getId() {
        return id;
    }
    public void addPessoas(Pessoa p) {
        pessoas.add(p);
    }
    
    
}
