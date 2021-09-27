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
public class Teste {
    public static void main(String[] args) {
        ImovelNovo casa1 = new NovoImovelCorretor(5, 100000, 5000);
        ImovelNovo casa2 = new ImovelNovo(5000, 100000);
        System.out.println("Valor total 1: " + casa1.calcularImovelNovo());
        System.out.println("Valor total 2: " + casa2.calcularImovelNovo());
    }
}
