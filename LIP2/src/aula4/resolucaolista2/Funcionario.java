/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4.resolucaolista2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mauricio.moreira
 */
public class Funcionario extends Pessoa {
    protected double salario;
    public List<Venda> vendas;

    public Funcionario(int Codigo, String nome) {
        super(Codigo);
        super.nome = nome;
        vendas = new ArrayList<>();
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public String getNome() {
        return nome;
    }
    public void addVendas(Venda v) {
        vendas.add(v);
    }
    public List<Venda> getVendas() {
        return vendas;
    }
}
