/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4.resolucaolista2;

import java.util.List;

/**
 *
 * @author mauricio.moreira
 */
public class Loja {
    public static void main(String[] args) {
        // criando os objetos funcionarios
        Funcionario f1 = new Funcionario(1, "FULANO");
        Funcionario f2 = new Funcionario(2, "CICRANO");
        // criar os objetos clientes
        Cliente c1 = new Cliente(100, "MAURICIO");
        Cliente c2 = new Cliente(101, "JOAO");
        // criar as vendas
        Venda lapis = new Venda(321, c1, f1);
        Venda borracha = new Venda(333, c2, f1);
        f1.addVendas(lapis);
        f1.addVendas(borracha);
        
        Venda pincel = new Venda(222, c1, f2);
        Venda papel = new Venda(444, c2, f2);
        f2.addVendas(pincel);
        f2.addVendas(papel);
        
        System.out.println("Funcionario: " + f1.getNome());
        System.out.println("Codigo: " + f1.getCodigo());
        List<Venda> vendasF1 = f1.getVendas();
        int total = 0;
        for (Venda v: vendasF1) {
            total++;
        }
        System.out.println("Total de Vendas de " + f1.getNome() + " : " + total );
        
        System.out.println("-------------------------");
        
        System.out.println("Funcionario: " + f2.getNome());
        System.out.println("Codigo: " + f2.getCodigo());
        List<Venda> vendasF2 = f2.getVendas();
        int total2 = 0;
        for (Venda v: vendasF2) {
            total2++;
        }
        System.out.println("Total de Vendas de " + f2.getNome() + " : " + total2 );
    }
}
