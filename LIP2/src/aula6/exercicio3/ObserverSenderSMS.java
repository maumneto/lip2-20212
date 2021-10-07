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
public class ObserverSenderSMS extends Observer {
    private List<String> telefones = new ArrayList<String>();
    
    public ObserverSenderSMS(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    
    public void getNumbers() {
        for (String number: telefones) {
            System.out.println(number);
        }
    }
 
    public void addNumber(String number) {
        this.telefones.add(number);
    }
    
    @Override
    public void update() {
        System.out.println("O evento esperado aconteceu!!");
        System.out.println("Enviando SMS para: ");
        getNumbers();
    }
}
