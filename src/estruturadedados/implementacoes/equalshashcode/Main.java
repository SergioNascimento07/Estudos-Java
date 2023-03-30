package estruturadedados.implementacoes.equalshashcode;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        
        List<Carro> listaCarros = new ArrayList<>();

        Carro carro1 = new Carro("chev");
        Carro carro2 = new Carro("volvo");

        listaCarros.add(carro1);
        listaCarros.add(carro2);
        //compara se contem o objeto
        System.out.println(listaCarros.contains(carro1));
        //contains compara com o valor exato, objeto não adianta ser criado da mesma forma, precisa ser aquele que foi colocado
        //caso seu metodo equals nao seja sobrescrevido
        System.out.println(new Carro("ford").hashCode());
        //Estrutura de dados utilizam tanto equals quanto hashcode para organizar os objetos


        Carro carro3 = new Carro("a");
        Carro carro4 = new Carro("a");
        listaCarros.add(new Carro("aa"));
        listaCarros.add(new Carro("bb"));
        System.out.println(listaCarros.contains(new Carro("aa")));
        //.contains utiliza o metodo equals -- por isso da pra alterar
        System.out.println(carro1.equals(carro2));
    }
}
