/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;

//H(n) define-se como sendo a soma da série harmônica:
//○ H(n) = 1 + 1/2 + 1/3 + .... 1/n
//○ Faça um programa que leia um valor de n inteiro e positivo e apresente o valor de H(n).
public class Questao5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        double sh = 0;
        System.out.print("Digite a quantidade de termos da série harmônica: ");
        n = in.nextInt();
        for(int i = 1; i <= n; i++) {
            sh = sh + (double) 1/i;
            System.out.println(sh);
        }
        System.out.println("Valor total da série harmônica: " + sh);
        in.close();
    }
}
