/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2.Exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Mauricio";
        p1.altura = 1.61;
        p1.anoNascimento = 1990;
        p1.dadosPessoa();
        System.out.println("Voce possui: " + p1.calculoIdade() + " anos");
    }
}
