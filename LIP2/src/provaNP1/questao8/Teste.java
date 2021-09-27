/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaNP1.questao8;

/**
 *
 * @author mauricio.moreira
 */
public class Teste {
    public static void main(String[] args) {
        Disciplina poo = new Disciplina("Programação Orientada a Objetos", "1234");
        Turma t1 = new Turma("100", 3, poo);
        poo.adicionarTurma(t1);
        System.out.println("A disciplina " + poo.getNomeDisciplina() + " possui a turma " + t1.id);
    }
}
