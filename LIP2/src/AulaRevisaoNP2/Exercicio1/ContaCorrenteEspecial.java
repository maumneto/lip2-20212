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
public class ContaCorrenteEspecial extends ContaBancaria {

    public ContaCorrenteEspecial(String nome) {
        super(nome);
    }
    
    public ContaCorrenteEspecial(double quantia, String nome) {
        super(quantia, nome);
    }
    
    @Override
    public void sacar(double quantia) {
        double juros = quantia*0.001;
        double montante = saldo();
        if (quantia+juros > montante) {
            System.out.println("Não tem dinheiro suficiente.");
        } else {
            montante = montante - quantia - juros;
        }
        setMontante(montante);
    }
}
