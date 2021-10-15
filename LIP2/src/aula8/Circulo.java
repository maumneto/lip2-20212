/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula8;

import java.util.Calendar;

/**
 *
 * @author mauricio.moreira
 */
public class Circulo {
    double raio;
    double y;
    double x;
    public static double contador = 0;
    
    public double area() {
        return 3.14f*raio*raio;
    }
    public static void incrementar() {
        contador++;
    }
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 4; i++) {
            Circulo.incrementar();
        }
        System.out.println(Circulo.contador);
//        Circulo c = new Circulo();
//        Calendar calendar = Calendar.getInstance();
        //c.raio = 3;
        //double z = c.area();
//        System.out.println("r classe: " + Circulo.r);
//        System.out.println("r instancia: " + c.r);
//        Circulo.r = 4;
//        System.out.println("r classe: " + Circulo.r);
//        System.out.println("r instancia: " + c.r);
//        Circulo.r = 111;
//        System.out.println("r classe: " + Circulo.r);
//        System.out.println("r instancia: " + c.r);
    }
}
