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
public class NovoImovelCorretor extends ImovelNovo {
    private double porcentagem;
    
    public NovoImovelCorretor(double porcentagem, double preco, double adicional) {
        super(adicional, preco);
        this.porcentagem = porcentagem;
    }
    @Override
    public double calcularImovelNovo() {
        double valorTotal = getPreco() + getAdicional() + getPreco()*(porcentagem/100);
        return valorTotal;
    }
    
}
