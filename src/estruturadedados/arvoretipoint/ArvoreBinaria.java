package estruturadedados.arvoretipoint;

class ArvoreBinaria {
    
    private BinNo raiz;

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

    public void remover(Integer conteudo){
        try{
            BinNo atual = this.raiz;
            BinNo pai = null;
            BinNo filho = null;
            BinNo temp = null;
            BinNo ultimoNoMaiorEsq = null;
            BinNo temp2 = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsq();
                }else {
                    atual = atual.getNoDir();
                }
            }

            if(atual == null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }

            // if(pai == null){ ---- arrumar remocao de raiz
            //     if(atual.getNoDir() == null){
            //         this.raiz = atual.getNoEsq();
            //     }else if(atual.getNoEsq() == null){
            //         this.raiz = atual.getNoDir();
            //     }else {
            //         for(temp = atual, filho = atual.getNoEsq();
            //             filho.getNoDir() == null;
            //             temp = filho, filho = filho.getNoDir()
            //         ){}
            //         if(filho != atual.getNoEsq()){
            //             filho.setNoDir(raiz.getNoDir());
            //             for (temp2 = filho,ultimoNoMaiorEsq = temp2.getNoEsq();
            //                 ultimoNoMaiorEsq.getNoEsq() == null;
            //                 temp2 = ultimoNoMaiorEsq, ultimoNoMaiorEsq = ultimoNoMaiorEsq.getNoEsq()
            //             ){}
            //             temp2.setNoDir(null);
            //             ultimoNoMaiorEsq.setNoEsq(atual.getNoEsq());
            //         }
                    
            //         raiz = filho;
            //     }
            //}
            else if(atual.getNoDir() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoEsq());
                }else {
                    pai.setNoDir(atual.getNoEsq());
                }
            }else if(atual.getNoEsq() == null){
                if(pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else {
                    pai.setNoDir(atual.getNoDir());
                }
            }else{
                temp = atual;
                filho = atual.getNoEsq();
                do {
                    if(filho != atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if(pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }
                    temp = filho ;
                    filho = filho.getNoDir();
                } while (filho.getNoDir() != null);
            }
        }catch (NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");
        }
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
