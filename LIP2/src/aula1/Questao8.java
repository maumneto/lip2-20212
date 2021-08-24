/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;

public class Questao8 {
    // método do fatorial que é recursivo
    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num*fatorial(num-1);
        }  
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, res;
        System.out.print("Digite um número inteiro e positivo: ");
        num = in.nextInt();
        if (num < 0) {
            System.out.println("Não é possível calcular o fatorial!");
        } else {
            // chamando o método recursivo
            res = fatorial(num);
            System.out.println("O fatorial é: " + res);
        }
    }
}
