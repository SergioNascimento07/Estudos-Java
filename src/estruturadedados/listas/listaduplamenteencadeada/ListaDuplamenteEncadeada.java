package estruturadedados.listas.listaduplamenteencadeada;

public class ListaDuplamenteEncadeada<T> {
    
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.ultimoNo = null;
        this.primeiroNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = primeiroNo;
        //se for acima da lista ele devolve o ultimo item da lista;
        for (int i=0; (i< index) && (noAuxiliar!=null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        // ate o momento as duas referencias desse no
        //estao nulas
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo == null) {
            this.primeiroNo = novoNo;
        }

        if (ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        this.tamanhoLista++;
    }

    public void add(int index, T elemento) {
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAuxiliar);

        if (novoNo.getNoProximo() != null) {
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        } else {
            novoNo.setNoPrevio(this.ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0){
            primeiroNo = novoNo;
        } else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }

        tamanhoLista++;
    }

    public void remove(int index) {
        if (index==0){
            this.primeiroNo = this.primeiroNo.getNoProximo();
            if (primeiroNo != null) {
                primeiroNo.setNoPrevio(null);;
            }
        } else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if(noAuxiliar != ultimoNo) {
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            } else {
                ultimoNo = noAuxiliar;
            }
        }
            // if(noAuxiliar.getNoProximo() != null) {
                //nao seria melhor que noAuxiliar != ultimoNo ???
            // }
        tamanhoLista--;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public String toString(){
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = this.primeiroNo;
        for (int i=0; i<this.size(); i++) {
            strRetorno += "[Nó{conteudo=" + noAuxiliar.getConteudo() + "}]--> ";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += null;
        return strRetorno;
        
    }
}
