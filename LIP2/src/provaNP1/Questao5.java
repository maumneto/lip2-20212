/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaNP1;

import java.util.Scanner;

/**
 *
 * @author mauricio.moreira
 */
public class Questao5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota1, nota2, media;
        System.out.print("Nota 1: ");
        nota1 = in.nextDouble();
        System.out.print("Nota 2: ");
        nota2 = in.nextDouble();
        media = (nota1 + nota2)/2;
        in.close();
        // situação dos alunos
        if (media >= 7) {
            System.out.println("Aprovado! Tchau!");
        } else if (media < 4) {
            System.out.println("Reprovado! Fica mais um pouco!");
        } else {
            System.out.println("Final! Bora fazer uma prova!");
        }
    }
}
