package collections.ordenacaolist;

import java.util.ArrayList;
import java.util.List;

class Gato {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    
    public String getNome() {
        return this.nome;
    }
    public Integer getIdade() {
        return this.idade;
    }
    public String getCor() {
        return this.cor;
    }

    public String toString() {
        return "{" + this.nome + ", " +  this.idade + ", " + this.cor + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Gato> listCat = new ArrayList<>(){{
            add(new Gato("jon", 24, "branco"));
            add(new Gato("miau", 12, "amarelo"));
            add(new Gato("zé", 56, "preto"));
        }};

        System.out.println(listCat);
    }
}
