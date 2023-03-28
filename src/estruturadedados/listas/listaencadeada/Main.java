package estruturadedados.listas.listaencadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Integer> minhaLista = new ListaEncadeada<>();

        minhaLista.add(1);
        minhaLista.add(2);
        minhaLista.add(3);
        minhaLista.add(4);

        System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.remove(2));
        System.out.println(minhaLista.size());
    }
}
