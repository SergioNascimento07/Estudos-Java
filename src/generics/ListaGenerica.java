package generics;

import java.util.ArrayList;
import java.util.List;

public class ListaGenerica<T> {
    
    List<T> minhaLista = new ArrayList<>();

    public void setItemLista(T item) {
        minhaLista.add(item);
    }

    public void getLista() {
        System.out.println(minhaLista.toString());
    }

    public T retornaItemLista(){
        return minhaLista.get(2);
    }
    
}
