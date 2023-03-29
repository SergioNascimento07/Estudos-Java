package estruturadedados.arvore;

import estruturadedados.arvore.model.Obj;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Obj> arvore = new ArvoreBinaria<>();

        arvore.inserir(new Obj(2));
        arvore.inserir(new Obj(6));
        arvore.inserir(new Obj(1));
        arvore.inserir(new Obj(16));
        arvore.exibirPreOrdem();
    }
}
