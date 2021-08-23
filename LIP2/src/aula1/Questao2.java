/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota1, nota2, media;
        //entrada de dados
        System.out.print("NP1: ");
        nota1 = in.nextFloat();
        System.out.print("NP2: ");
        nota2 = in.nextFloat();
        // processamento
        media = (nota1 + nota2)/2;
        System.out.println("\nMedia = " + media);
        if (media >= 7.0) {
            System.out.println("Aprovado!! Vai com Deus!");
        } else if (media < 4.0) {
            System.out.println("Reprovado!! Voolta!");
        } else {
            float notaFinal, mediaFinal;
            System.out.print("Nota Final: ");
            notaFinal = in.nextFloat();
            mediaFinal = (media + notaFinal)/2;
            System.out.println("Media Final = " + mediaFinal);
            if (mediaFinal >= 5.0) {
                System.out.println("Aprovado! Se livrou hein...");
            } else {
                System.out.println("Reprovado! Fica mais um pouco...");
            }
        }
        in.close();
    }
}
