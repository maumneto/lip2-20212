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
public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome) {
        super(nome);
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
