package collections.map.ordenarmap;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class Livro {
    public String nome;
    public Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) 
            return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    public int hashCode() {
        return Objects.hash(nome, paginas);
    }


    public String toString() {
        return "Livro{" + "nome=" + nome + ", paginas" + paginas + "}";
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().nome.compareToIgnoreCase(o2.getValue().nome);
    }
}

public class Main {
    public static void main(String[] args) {
        //hash em ordem aleatória
        Map<String, Livro> myBook = new HashMap<>(){{
            put("hawking", new Livro("meuLivro1", 266));
            put("maisuMA", new Livro("mains", 656));
            put("mafafaf", new Livro("olivssw", 123));
            put("aaaaaaa", new Livro("oledc", 423));
            put("ccccccc", new Livro("trust", 857));
        }};

        // for (Map.Entry<String, Livro> meuLivro: myBook.entrySet()) {
        //     System.out.println(meuLivro.getKey());
        //     System.out.println(meuLivro.getValue());
        // }

        //linked ordem de insercao
        Map<String, Livro> myBook1 = new LinkedHashMap<>(){{
            put("hawking", new Livro("meuLivro1", 266));
            put("maisuMA", new Livro("mains", 656));
            put("mafafaf", new Livro("olivssw", 123));
            put("aaaaaaa", new Livro("oledc", 423));
            put("ccccccc", new Livro("trust", 857));
        }};

        // for (Map.Entry<String, Livro> meuLivro: myBook1.entrySet()) {
        //     System.out.println(meuLivro.getKey());
        //     System.out.println(meuLivro.getValue());
        // }

        //tree se não passar comparator ele ordena por alfabeto de chave
        Map<String, Livro> myBook2 = new TreeMap<>(){{
            put("hawking", new Livro("meuLivro1", 266));
            put("maisuMA", new Livro("mains", 656));
            put("mafafaf", new Livro("olivssw", 123));
            put("aaaaaaa", new Livro("oledc", 423));
            put("ccccccc", new Livro("trust", 857));
        }};

        // for (Map.Entry<String, Livro> meuLivro: myBook2.entrySet()) {
        //     System.out.println(meuLivro.getKey());
        //     System.out.println(meuLivro.getValue());
        // }
        
        //Está ordenando em ordem alfabética
        //TreeSet usa o metodo compare de Comparator
        Set<Map.Entry<String, Livro>> myBook4 = new TreeSet<>(new ComparatorNome());
        myBook4.addAll(myBook2.entrySet());
        System.out.println(myBook4);

    }
}
