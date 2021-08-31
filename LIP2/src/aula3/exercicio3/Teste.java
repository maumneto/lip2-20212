/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3.exercicio3;

/**
 *
 * @author newaccount
 */
public class Teste {
    public static void main(String[] args) {
        Professor mauricio = new Professor("mauricio", 1);
        Professor fulano = new Professor("fulano da silva", 2);
        
        Disciplina poo = new Disciplina("POO", 123);
        Disciplina lip1 = new Disciplina("LIP1", 321);
        
        poo.addProfessor(mauricio);
        lip1.addProfessor(fulano);
        lip1.addProfessor(mauricio);
        
        mauricio.addDisciplina(lip1);
        mauricio.addDisciplina(poo);
        fulano.addDisciplina(lip1);
        
        System.out.println("Disciplinas Ministradas por " + mauricio.getNomeProfessor());
        mauricio.showDisciplinas();
        System.out.println("-----------");
        
        System.out.println("Disciplinas Ministradas por " + fulano.getNomeProfessor());
        fulano.showDisciplinas();
        System.out.println("-----------");
        
        System.out.println("Professores da disciplina " + lip1.getNomeDisciplina());
        lip1.showProfessors();
    }
}
