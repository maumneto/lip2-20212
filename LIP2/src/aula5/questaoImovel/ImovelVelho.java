/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5.questaoImovel;

/**
 *
 * @author mauricio.moreira
 */
public class ImovelVelho extends Imovel {
    private double desconto;
    
    public ImovelVelho(double desconto, double preco) {
        super(preco);
        this.desconto = desconto;
    }
    public double getDesconto() {
        return this.desconto;
    }
    public double calcularImoveVelho() {
        return getPreco() - desconto;
    }
}
