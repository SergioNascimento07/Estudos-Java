package estruturadedados.arvoretipoint;

class ArvoreBinaria {
    
    public BinNo raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(Integer conteudo) {
        BinNo novoNo = new BinNo(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private BinNo inserir(BinNo atual, BinNo novoNo) {
        if (atual == null) {
            return novoNo;
        } else if(novoNo.compareValue(atual.getConteudo()) <0) {
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

    private void exibirInOrdem(BinNo atual) {
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

    private void exibirPosOrdem(BinNo atual) {
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

    private void exibirPreOrdem(BinNo atual) {
        if (atual != null) {
            System.out.print((atual.getConteudo()) + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }
}
