/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaRevisaoNP2.Exercicio1;

/**
 *
 * @author mauricio.moreira
 */
public class ContaBancaria implements OperacoesBancarias, DadosCliente {
    private double montante;
    public String nome;
    
    public ContaBancaria(String nome) {
        this.montante = 0;
        this.nome = nome;
    }
    
    public ContaBancaria(double montante, String nome) {
        this.montante = montante;
        this.nome = nome;
    }
    
    public void setMontante(double montante) {
        this.montante = montante;
    }
    
    @Override
    public void depositar(double quantia) {
        montante = montante + quantia;
    }
    @Override
    public void sacar(double quantia) {
        double juros = quantia*0.005;
        if (quantia+juros > montante) {
            System.out.println("Não tem dinheiro suficiente.");
        } else {
            montante = montante - quantia - juros;
        }
    }
    @Override
    public double saldo() {
        return montante;
    }
    
    @Override
    public String getNome(){
        return nome;
    }
    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
