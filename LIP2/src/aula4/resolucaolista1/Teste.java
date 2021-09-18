/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4.resolucaolista1;

/**
 *
 * @author mauricio.moreira
 */
public class Teste {
    public static void main(String[] args) {
        Departamento dep = new Departamento(1);
        Pessoa p1 = new Pessoa("mauricio");
        Pessoa p2 = new Pessoa("joão");
        dep.addPessoas(p1);
        PessoaFisica pf1 = new PessoaFisica("fulano");
        pf1.setCpf("1234567");
        System.out.println(pf1.nome);
        System.out.println(pf1.getCpf());
    }
}
