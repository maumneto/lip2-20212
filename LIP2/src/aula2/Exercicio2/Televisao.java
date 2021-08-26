/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2.Exercicio2;

/**
 *
 * @author newaccount
 */
public class Televisao {
    public int canal;
    public int volume;
    public  Televisao() {
        this.canal = 0;
        this.volume = 0;
        System.out.println("TV inicializada!");
    }
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        ControleRemoto control = new ControleRemoto(tv.volume, tv.canal);
        
        control.mostrarDadosControle();
        for (int i = 0; i < 10; i++) {
            control.aumentarCanal();
            control.aumentarVolume();
        }
        control.mostrarDadosControle();
        control.trocarCanal(55);
        control.mostrarDadosControle();
    }
}
