/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

/**
 *
 * @author mauricio.moreira
 */
public class Teste {
    public static void main(String[] args) {
        A obja = new A();
        B objb = new B();
        System.out.println("b: " + obja.b);
        objb.setA(333);
        System.out.println("a: " + objb.getA());
    }
}
