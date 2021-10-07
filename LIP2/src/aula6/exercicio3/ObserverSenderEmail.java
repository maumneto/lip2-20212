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
public class ObserverSenderEmail extends Observer {
    private List<String> emails = new ArrayList<String>();
    
    public ObserverSenderEmail(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    public void getEmail() {
        for (String email: emails) {
            System.out.println(email);
        }
    }
    
    public void addEmail(String email) {
        emails.add(email);
    }
    
    @Override
    public void update() {
        System.out.println("O evento esperado aconteceu!!");
        System.out.println("Enviando email para: ");
        getEmail();
    }
}
