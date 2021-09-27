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
public class Questao7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, fat = 1;
        System.out.print("Digite um número positivo e inteiro: ");
        n = in.nextInt();
        if (n < 0) {
            System.out.println("Não é possível calcular o fatorial!");
        } else {
            for (int i = 1; i <= n; i++) {
                fat = fat*i;
                System.out.println(fat);
            }
            System.out.println("Fatorial: " + fat);
        }
    }
}
