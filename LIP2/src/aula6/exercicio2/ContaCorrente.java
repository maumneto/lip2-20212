/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6.exercicio2;

/**
 *
 * @author mauricio.moreira
 */
public class ContaCorrente implements OperacoesBancarias, OperacoesPessoais {
    public double montante;
    public String nome;
    public int id;
    
    public ContaCorrente(String nome) {
        this.nome = nome;
        this.montante = 0;
        this.id = 0;
    }
    public ContaCorrente(String nome, double montante) {
        this.montante = montante;
        this.nome = nome;
        this.id = 0;
    }
    @Override
    public void depositar(double quantia) {
        montante = montante + quantia;
    }
    @Override
    public void sacar(double quantia){
        if (montante < (quantia + quantia*0.05)) {
            System.out.println("Não a saldo o suficiente!");
        } else {
            montante = montante - quantia - quantia*0.05;
        }
    }
    @Override
    public double saldo() {
        return this.montante;
    }
    @Override
    public String getNome() {
        return this.nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public int getId() {
        return this.id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
}
