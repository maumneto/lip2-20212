/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author newaccount
 */
public class Principal {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.qtdPneus = 4;
        c1.qtdPortas = 4;
        c1.cor = "Cinza!";
        c1.cilindradas = 1500;
        c1.acelerar();
        c1.frear();
        Carro c2 = new Carro();
        c2.qtdPortas = 2;
        c2.qtdPneus = 4;
        c2.cor = "Vermelho";
        c2.cilindradas = 2000;
        System.out.println(c1.cor);
        System.out.println(c2.cor);
        //System.out.println(c1);
    }
}
