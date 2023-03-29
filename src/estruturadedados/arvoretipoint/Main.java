package estruturadedados.arvoretipoint;

class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(20);
        arvore.inserir(10);
        arvore.inserir(30);
        arvore.inserir(35);
        arvore.inserir(25);
        arvore.inserir(15);
        arvore.inserir(9);
        arvore.inserir(6);

        arvore.exibirPreOrdem();
    }
}
