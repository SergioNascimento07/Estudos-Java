package estruturadedados.listas.listacircular;

public class ListaCircular<T> {
    
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular(){
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setRefProximoNo(cauda);
        } else {
            novoNo.setRefProximoNo(this.cauda); 
            //adicionando atras da cauda
            this.cabeca.setRefProximoNo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }   

    public boolean isEmpty() {
        return this.tamanhoLista==0?true:false;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        } 
        if (index==0) {
            return this.cauda;
        }
        
        if (index >= size() || index<0) {
            throw new IndexOutOfBoundsException();
        } else {
            No<T> noAuxiliar = this.cauda;
            for (int i=0; i<index; i++){
                noAuxiliar = noAuxiliar.getRefProximoNo();
            }
            return noAuxiliar;
        }
    }

    public void remove(int index) {
        if (index >= this.tamanhoLista || index<0){
            throw new IndexOutOfBoundsException();
        }
        No<T> noAuxiliar = this.cauda;
        if(index==0){
            this.cauda  = this.cauda.getRefProximoNo();
            this.cabeca.setRefProximoNo(this.cauda);
        } else if (index == 1){
            this.cauda.setRefProximoNo(this.cauda.getRefProximoNo().getRefProximoNo());
        } else {
            for (int i = 0; i < index-1; i++) {
                noAuxiliar = noAuxiliar.getRefProximoNo();
            }
            noAuxiliar.setRefProximoNo(noAuxiliar.getRefProximoNo().getRefProximoNo());
        } //implementação exclui a referencia do anterios daquele item, logo ele sai da fila
        tamanhoLista--;
    }

    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = this.cauda;

        for (int i=0; i<size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]---> ";
            noAuxiliar = noAuxiliar.getRefProximoNo();
        }

        if (this.isEmpty()) 
            return "[]";
        strRetorno += "(Retorna ao inicio)";
        return strRetorno;

    }


}


