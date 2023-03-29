package estruturadedados.arvore.model;

public abstract class ObjArvore<T> implements Comparable<T>{
    @Override
    public abstract int compareTo(T o);
}
