/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3.exercicio1;

/**
 *
 * @author newaccount
 */
public class Teste {
    public static void main(String[] args) {
        Disciplina poo = new Disciplina(1, "Programação Orientado a Objetos");
        Professor mauricio = new Professor("Maurício Neto", 123, poo);
        poo.setProfessor(mauricio);
        System.out.println("Disciplina: " + poo.getNomeDisciplina());
        System.out.println("Professor: " + poo.getNomeProfessor());
    }
}
