package estruturadedados.listas.listaencadeada;

public class ListaEncadeada<T> {
    
    private No<T> refNoEntrada;

    public ListaEncadeada(){
        refNoEntrada = null;
    }

    public boolean isEmpty() {
        return refNoEntrada == null?true:false;
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAux = refNoEntrada;
        while(true){
            if (referenciaAux != null) {
                tamanhoLista ++;
                if (referenciaAux.getProximoNo() != null){    
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if(this.isEmpty()) {
            this.refNoEntrada = novoNo;
            return; //para o metodo todo
        }

        No<T> noAuxiliar = refNoEntrada;
        for (int i=0; i< this.size()-1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        //chega no ultimo nó e adiciona lá
        //troca a referencia do ultimo de null para o novo ultimo
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {

        validaIndice(index);

        No<T>  noAuxiliar = refNoEntrada;
        No<T> noRetorno = null;
        // i<index ou i<size() ???
        for (int i=0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;
    }
    //|| index<0 -- colocar p evitar erro
    private void validaIndice(int index) {
        if (index >= this.size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index + ", a lista vai até o indice " + ultimoIndice);
        }
    }

    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if(index==0){
            refNoEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = refNoEntrada;
        for (int i=0; i<this.size(); i++){
            strRetorno += "[No{" + noAuxiliar.getConteudo() + "}] -->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += null;

        return strRetorno;
    }
}
