package estoque;

import java.text.NumberFormat;

public class Produto {
    //Atributos
    private int idProduto;
    private String nome;
    private double preco;
    private int quantidade;
    private boolean estado;
    private NumberFormat formatter;

    public Produto() {
        formatter = NumberFormat.getCurrencyInstance();
    }

    public Produto(int idProduto, String nome, double preco, int quantidade, boolean estado) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.estado = estado;
    }

    //getters e setters

    public int getIdProduto() {
        return this.idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String toString() { // entende que se refere ao atributo mesmo sem this
        return "Produto: [idProduto=" + idProduto + ", nome=" + nome + ", preco=" + formatter.format(preco) + ",  quantidade=" + formatter.format(quantidade) + ", precoFinal=" + (preco+quantidade) +", estado=" + (estado?"ativo":"desativo") + "]";
    }
}
