/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6.exercicio3;

/**
 *
 * @author mauricio.moreira
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject evento_monitorado = new Subject();
        
        ObserverSenderEmail sender_email = new ObserverSenderEmail(evento_monitorado);
        ObserverSenderSMS sender_sms = new ObserverSenderSMS(evento_monitorado);
        
        sender_email.addEmail("mauricio@provedor.com");
        sender_email.addEmail("fulano@provedor.com");
        
        sender_sms.addNumber("85 911223344");
        sender_sms.addNumber("85 944332211");
        
        for (int i = 0; i < 5; i++) {
            if (evento_monitorado.isEven(i)) {
                evento_monitorado.notifyAllAttached();
                System.out.println("------");
            }
        }
    }
}
