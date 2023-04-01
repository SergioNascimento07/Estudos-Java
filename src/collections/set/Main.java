package collections.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Serie implements Comparable<Serie>{
    public String nome;
    public String genero;
    public Integer tempoEp;

    public Serie(String nome, String genero, Integer tempoEp){
        this.nome = nome;
        this.genero = genero;
        this.tempoEp = tempoEp;
    }

    public String toString(){
        return "{" +
        "nome=" + nome + ", genero=" + genero +
        ", tempoEp=" + tempoEp + "}";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) 
            return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEp.equals(serie.tempoEp);
    }

    public int hashCode() {
        return Objects.hash(nome, genero, tempoEp);
    }

    @Override
    public int compareTo(Serie o) {
        int tempoEpisodio = Integer.compare(this.tempoEp, o.tempoEp);
        if (tempoEpisodio != 0) return tempoEpisodio;
        //se tempo for igual calcula por genero, ordem alfabetica
        //usa o compareTo da classe String
        return this.genero.compareTo(o.genero);
    }
}

class ComparatorNomeGeneroTempoEp implements Comparator<Serie> {

    public int compare(Serie serie1, Serie serie2) {
        int nome = serie1.nome.compareTo(serie2.nome);
        if (nome != 0) return nome;

        int tempoEpisodio = Integer.compare(serie1.tempoEp, serie2.tempoEp);
        if (tempoEpisodio != 0) return tempoEpisodio;

        return Integer.compare(serie1.tempoEp, serie2.tempoEp);
    }
    
}

public class Main {
    public static void main(String[] args) {
        //set == conjunto
        //exibe em forma aleatoria
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("aaaaa", "aaaaa", 60));
            add(new Serie("bbbbb", "bbbbb", 55));
            add(new Serie("ccccc", "ccccc", 70));
            add(new Serie("ddddd", "ddddd", 43));
        }};
        System.out.println(Collections.max(minhasSeries));
        System.out.println(minhasSeries);
        for (Serie serie: minhasSeries) {
            System.out.println(serie.nome);
        }

        //treeSet precisa da interface comparable
        Set<Serie> minhaSeries2 = new TreeSet<>(){{
            add(new Serie("aaaaa", "aaaaa", 60));
            add(new Serie("bbbbb", "bbbbb", 55));
            add(new Serie("ccccc", "ccccc", 70));
            add(new Serie("ddddd", "ddddd", 43));
        }};

        for (Serie serie: minhaSeries2) {
            System.out.println(serie.nome);
        }

        //Da pra passar comparator em arvore para definir ordenação
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEp());
        minhasSeries3.addAll(minhasSeries);
        System.out.println(minhasSeries3.size());

        for (Serie serie: minhasSeries3) {
            System.out.println(serie.nome);
        }
    }

}
