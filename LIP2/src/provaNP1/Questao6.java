/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaNP1;

/**
 *
 * @author mauricio.moreira
 */
class Produto {
    public String nome;
    public String codigo;
    public String descricao;
    public float preco;

    public Produto(String nome, String codigo, String descricao, float preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }
    public void mostrarDadosProduto() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Código: " + this.codigo);
        System.out.println("Preço: " + this.preco);
    }
    public float calcularTotal(int quantidade) {
        return this.preco*quantidade;
    }
}

public class Questao6 {
    public static void main(String[] args) {
        Produto p = new Produto("caneta", "123", "Caneca azul da compactor", 5.99f);
        p.mostrarDadosProduto();
        System.out.println("Total: " + p.calcularTotal(5));
    }
}
