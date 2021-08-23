/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double altura, peso = 0;
        String sexo;
        // entrada de dados
        System.out.println("Qual o seu sexo (h/m): ");
        sexo = in.next();
        System.out.println("Qual a sua altura: ");
        altura = in.nextDouble();
        in.close();
        // verificação da condicional
        switch(sexo) {
            case "h":
                peso = 72.7*altura - 58;
                break;
            case "m":
                peso = 62.1*altura - 44.7;
                break;
            default:
                System.out.println("Nenhum sexo válido foi digitado");
                break;
        }
        System.out.printf("Peso Ideal: %.2f", peso);
    }
}
