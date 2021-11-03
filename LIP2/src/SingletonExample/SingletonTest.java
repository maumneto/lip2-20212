/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonExample;

/**
 *
 * @author mauricio.moreira
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton firstSingleton = Singleton.getInstance();
        Singleton secodeSingleton = Singleton.getInstance();
        
        var result = (firstSingleton == secodeSingleton) ? "The objects are the same" : "The objects are different";
        System.out.println(result);
    }
}
