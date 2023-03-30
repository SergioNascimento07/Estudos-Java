package estruturadedados.arvoretipoint;

class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(2);
        arvore.inserir(7);
        arvore.inserir(8);
        arvore.inserir(6);
        arvore.inserir(1);
        arvore.inserir(20);
        arvore.inserir(12);
        arvore.remover(12);
        

        arvore.exibirInOrdem();
    }
}
