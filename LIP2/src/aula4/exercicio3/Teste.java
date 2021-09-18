/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4.exercicio3;

/**
 *
 * @author mauricio.moreira
 */
public class Teste {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.nome = "Mauricio";
        func.salario = 1000;
        Programador prog = new Programador();
        prog.nome = "João";
        prog.salario = 1500;
        System.out.println(func.nome);
        System.out.println(func.salario);
        System.out.println(prog.nome);
        System.out.println(prog.salario);
        
    }
}
