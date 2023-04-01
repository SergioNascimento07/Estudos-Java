package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;

class Estado{
    public String nome;
    public int populacao;

    public Estado(String nome, int populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }

    public String toString() {
        return "Estado --> {" + nome + ", " + populacao + "}";
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Estado>>{

    @Override
    public int compare(Entry<String, Estado> o1, Entry<String, Estado> o2) {
        return o1.getValue().nome.compareToIgnoreCase(o2.getValue().nome);
    }
    
}

public class EstadosMap {
    public static void main(String[] args) {
        // Map<String, Estado> meusEstados = new HashMap(){{
        //     put("RJ", new Estado("Rio de Janeiro", 21421414));
        //     put("SP", new Estado("São Paulo", 21421414));
        //     put("DF", new Estado("Brasilia", 21421414));
        // }};

        // meusEstados.put("RJ", new Estado("Rio de jan", 12));
        // System.out.println(meusEstados);

        // //dá pra adicionar depois
        // meusEstados.put("novo", new Estado("aqui", 123231));
        // System.out.println(meusEstados);

        // System.out.println(meusEstados.containsKey("RJ"));

        Map<String, Estado> meusEstados2 = new LinkedHashMap(){{
            put("RJ", new Estado("Rio de Janeiro", 21421414));
            put("SP", new Estado("São Paulo", 21421414));
            put("DF", new Estado("Brasilia", 21421414));
        }};

        // System.out.println(meusEstados2);
        //pra implementar comparator precisa transformar em
        //por ordem alfabética
        Set<Map.Entry<String, Estado>> esse = new TreeSet<>(new ComparatorNome());

        esse.addAll(meusEstados2.entrySet());
        System.out.println(esse);
    }
}
