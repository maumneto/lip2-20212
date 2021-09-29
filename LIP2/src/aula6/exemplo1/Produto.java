/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6.exemplo1;

/**
 *
 * @author mauricio.moreira
 */
public abstract class Produto {
    public String nome;
    public double preco;
    public int id;
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public double getId() {
        return this.id;
    }
    
    public abstract void atualizar(String nome, double preco);
    public abstract void mostrarDados();
}
