package estruturadedados.implementacoes.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarro = new ArrayList<>();

        listaCarro.add(new Carro("a"));
        listaCarro.add(new Carro("b"));
        listaCarro.add(new Carro("c"));
        listaCarro.add(new Carro("d"));

        System.out.println(listaCarro);

        System.out.println(listaCarro.indexOf(new Carro("c")));
        //passa o item e ele retorna o indice

        System.out.println(listaCarro.get(1));


        listaCarro.remove(0);
        System.out.println(listaCarro);
    }
}
