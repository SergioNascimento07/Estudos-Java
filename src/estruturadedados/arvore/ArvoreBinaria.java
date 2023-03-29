package estruturadedados.arvore;
//Dá pra implementar Comparable ou herdar
public class ArvoreBinaria<T extends Comparable<T>> {
    
    private BinNo<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
        if (atual == null) {
            return novoNo;
        } else if(novoNo.getConteudo().compareTo(atual.getConteudo()) <0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;
    }

    public void exibirInOrdem() {
        System.out.println("*****Exibindo inOrder*****");
        System.out.print("[");
        exibirInOrdem(this.raiz);
        System.out.print("]");
    }

    private void exibirInOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());
            System.out.print((atual.getConteudo()) + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem() {
        System.out.println("*****Exibindo inOrder*****");
        System.out.print("[");
        exibirPosOrdem(this.raiz);
        System.out.print("]");
    }

    private void exibirPosOrdem(BinNo<T> atual) {
        if (atual != null) {
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print((atual.getConteudo()) + ", ");
        }
    }

    public void exibirPreOrdem() {
        System.out.println("*****Exibindo inOrder*****");
        System.out.print("[");
        exibirPreOrdem(this.raiz);
        System.out.print("]");
    }

    private void exibirPreOrdem(BinNo<T> atual) {
        if (atual != null) {
            System.out.print((atual.getConteudo()) + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }
}
