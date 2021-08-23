/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        double valorHora, salarioBruto, inss, ir, sind, salarioLiq;
        int horas;
        //entrada de dados
        Scanner in = new Scanner(System.in);
        System.out.print("Qual o valor da hora?");
        valorHora = in.nextDouble();
        System.out.print("Quantas horas trabalhadas no mes? ");
        horas = in.nextInt();
        in.close();
        // processamentos
        salarioBruto = valorHora * horas;
        ir = 0.11 * salarioBruto;
        inss = 0.08 * salarioBruto;
        sind = 0.05 * salarioBruto;
        salarioLiq = salarioBruto - inss - ir - sind;
        // saída de dados
        System.out.println("+ Salario Bruto: R$ " + salarioBruto);
        System.out.println("- IR: R$ " + ir);
        System.out.println("- INSS: R$ " + inss);
        System.out.println("- Sindicato: R$ " + sind);
        System.out.println("= Salario Liquido: R$ " + salarioLiq);
    }
}

