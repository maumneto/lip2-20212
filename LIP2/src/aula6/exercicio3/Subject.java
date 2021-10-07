/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6.exercicio3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mauricio.moreira
 */
public class Subject {
    public List<Observer> observers = new ArrayList<Observer>();
    
    public boolean isEven(int n) {
        boolean flag = false;
        if (n % 2 == 0) {
            flag = true;
        }
        return flag;
    }
    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    public void notifyAllAttached() {
        for (Observer ob: observers) {
            ob.update();
        }
    }
}
