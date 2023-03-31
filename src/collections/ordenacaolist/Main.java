package collections.ordenacaolist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Gato implements Comparable<Gato>{
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

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareTo(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
        //retorna 0, 1 ou -1
    }
    
    
}

class ComparatorCor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
        //retorna 0, 1 ou -1
        //compara tamanho da String
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());

        if (nome != 0) {
            return nome;
        } 

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());

        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

public class Main {
    public static void main(String[] args) {
        List<Gato> listCat = new ArrayList<>(){{
            add(new Gato("jon", 24, "branco"));
            add(new Gato("jon", 23, "branco"));
            add(new Gato("jon", 22, "branco"));
            add(new Gato("miau", 12, "amarelo"));
            add(new Gato("zé", 56, "preto"));
        }};

        System.out.println(listCat);

        Collections.shuffle(listCat); //embaralha lista

        System.out.println(listCat);

        //organiza lista mas precisa ter o método compareTo
        Collections.sort(listCat);
        System.out.println(listCat);


        //Pode implementar o metodo comparator e passar
        Collections.sort(listCat, new ComparatorIdade());
        System.out.println(listCat);

        Collections.sort(listCat, new ComparatorCor());
        System.out.println(listCat);

        Collections.sort(listCat, new ComparatorNomeCorIdade());
        //compara primeiro por nome, se for igual, compara por cor se nao por idade

    }
}
