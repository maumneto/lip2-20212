/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4.resolucaolista1;

/**
 *
 * @author mauricio.moreira
 */
public class Pessoa {
    private int id;
    protected String nome;
    public Departamento departamento;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    protected int getId() {
        return this.id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDepartameto(Departamento departamento) {
        this.departamento = departamento;
    }
    
}
