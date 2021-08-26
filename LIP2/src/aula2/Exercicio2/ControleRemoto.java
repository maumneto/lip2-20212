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
public class ControleRemoto {
    int volume;
    int canal;
    public ControleRemoto(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }
    public int aumentarVolume() {
        return this.volume++;
    }
    public int diminuirVolume() {
        return this.volume--;
    }
    public int aumentarCanal() {
        return this.canal++;
    }
    public int diminuirCanal() {
        return this.canal--;
    }
    public void trocarCanal(int canalNovo) {
        this.canal = canalNovo;
    }
    public void mostrarDadosControle() {
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }
}
