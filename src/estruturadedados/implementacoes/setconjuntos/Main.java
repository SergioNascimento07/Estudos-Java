package estruturadedados.implementacoes.setconjuntos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//hashSet é conjunto
public class Main {
    public static void main(String[] args) {
        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro("a"));
        hashSetCarros.add(new Carro("b"));
        hashSetCarros.add(new Carro("c"));
        hashSetCarros.add(new Carro("d"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarro = new TreeSet<>();
        //São arvores
        //TreeSet faz uso da interface compareTo 
        //por isso é necessario implemetar ela na classe

        treeSetCarro.add(new Carro("as"));
        treeSetCarro.add(new Carro("bad"));
        treeSetCarro.add(new Carro("cdDd"));
        treeSetCarro.add(new Carro("ds"));

        System.out.println(treeSetCarro);
    }
}
