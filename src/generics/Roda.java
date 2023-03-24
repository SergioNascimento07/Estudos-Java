package generics;

import java.util.ArrayList;

public class Roda {
    public static void main(String[] args) {
        ListaGenerica<String> lista1 = new ListaGenerica<>();
        lista1.setItemLista("a");
        lista1.setItemLista("b");
        lista1.setItemLista("c");
        System.out.println(lista1.retornaItemLista());
        lista1.getLista();

        ListaGenerica<Integer> lista2 = new ListaGenerica<>();
        lista2.setItemLista(2);
        lista2.setItemLista(3);
        lista2.setItemLista(4);
        System.out.println(lista2.retornaItemLista());
        lista2.getLista();

        //Array list permite armazenar diferentes classes
        //problema de precisar fazer casting
        ArrayList dada = new ArrayList();
        dada.add("olá");
        dada.add(new Integer(23));
        dada.add(new Double(4.23));
        System.out.println(dada.toString());
    }
}
