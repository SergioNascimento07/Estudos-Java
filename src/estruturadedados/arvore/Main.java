package estruturadedados.arvore;

import estruturadedados.arvore.model.Obj;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria<Obj> arvore = new ArvoreBinaria<>();

        arvore.inserir(new Obj(13));
        arvore.inserir(new Obj(25));
        arvore.inserir(new Obj(10));
        arvore.inserir(new Obj(2));
        arvore.inserir(new Obj(12));
        arvore.inserir(new Obj(20));
        arvore.inserir(new Obj(31));
        arvore.inserir(new Obj(29));
        arvore.inserir(new Obj(32));
        
        arvore.exibirInOrdem();//ta printando o "meuValor" do obj pq ele tem metodo toString que print conteudo
        // arvore.exibirInOrdem();
        // arvore.exibirPosOrdem();
        // arvore.remover(new Obj(25));
        arvore.remover(new Obj(13));
        arvore.exibirInOrdem();
    }
}
