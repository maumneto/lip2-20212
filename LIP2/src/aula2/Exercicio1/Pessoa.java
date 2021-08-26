/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2.Exercicio1;

import java.util.Calendar;

public class Pessoa {
    public String nome;
    public int anoNascimento;
    public double altura;
    public void dadosPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Altura: " + altura);
    }
    public int calculoIdade() {
        int anoAtual, idade = 0;
        Calendar calendar = Calendar.getInstance();
        anoAtual = calendar.get(Calendar.YEAR);
        idade = anoAtual - this.anoNascimento;
        return idade;
    }
}