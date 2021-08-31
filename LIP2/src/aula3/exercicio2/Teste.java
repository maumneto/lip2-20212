/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3.exercicio2;

/**
 *
 * @author newaccount
 */
public class Teste {
    public static void main(String[] args) {
        Professor profMauricio = new Professor("Maurício", 10);
        Disciplina poo = new Disciplina("Programação Orientada a Objeto", 123, profMauricio);
        Disciplina lip1 = new Disciplina("Linguagens de Programação I", 321, profMauricio);
        
        profMauricio.addDisciplina(lip1);
        profMauricio.addDisciplina(poo);
        
        System.out.println("Professor: " + profMauricio.getNomeProfessor());
        System.out.println("Total de Disciplinas: " + profMauricio.getTotalDisciplinas());
        System.out.println("Disciplinas Atuais: ");
        profMauricio.getNomeDisciplinas();
    }
}
