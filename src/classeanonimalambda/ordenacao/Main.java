package classeanonimalambda.ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

class Estado{
    public String nome;
    public Integer populacao;

    public Estado(String nome, Integer populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }

    public String toString() {
        return "Estado --> {" + nome + ", " + populacao + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        

        Map<String, Estado> meusEstados2 = new LinkedHashMap(){{
            put("RJ", new Estado("Rio de Janeiro", 532323323));
            put("SP", new Estado("São Paulo", 24222223));
            put("DF", new Estado("Brasilia", 331123333));
        }};
        System.out.println(meusEstados2);

        Set<Map.Entry<String, Estado>> setmeu = new TreeSet<>(new Comparator<Map.Entry<String, Estado>>() {

            @Override
            public int compare(Entry<String, Estado> o1, Entry<String, Estado> o2) {
                return o1.getValue().populacao.compareTo(o2.getValue().populacao);
            }
           
        });
        setmeu.addAll(meusEstados2.entrySet());

        System.out.println(setmeu);

        //função anonima usos
        //não precisa passar o tipo na funcao anonima pq o q vai entrar ja esta sendo selecionado
        Set<Map.Entry<String, Estado>> setmeu2 = new TreeSet<>(Comparator.comparing(estado -> estado.getKey()));
        //comparing pode comparar com string em ordem alfabetica, ou numero
        setmeu2.addAll(meusEstados2.entrySet());

        System.out.println(setmeu2);
    }
}
