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
public class ImovelNovo extends Imovel{
    private double adicional;

    public ImovelNovo(double adicional, double preco) {
        super(preco);
        this.adicional = adicional;
    }
    public double getAdicional() {
        return this.adicional;
    }
    public double calcularImovelNovo() {
        return adicional + getPreco();
    }
}
