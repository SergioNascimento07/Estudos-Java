package estruturadedados.listas.listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<Integer> minhaLista = new ListaDuplamenteEncadeada<>();
        for (int i=0; i<3;i++){
            minhaLista.add(1);
        }
        
        minhaLista.add(2);
        minhaLista.add(3);
        
        System.out.println(minhaLista);

        minhaLista.remove(1);

        System.out.println(minhaLista);

        minhaLista.add(1, 45);

        System.out.println(minhaLista);
        System.out.println(minhaLista.size());
    }
}
