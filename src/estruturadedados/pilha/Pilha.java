package estruturadedados.pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    public boolean isEmpty(){
        return refNoEntradaPilha==null?true:false;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public void push(No novoNo){
        No NoRefAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(NoRefAuxiliar);
        //a referenvia do novoNo é a antiga referencia de topo
    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        } else {
            return null;
        }
    }

    public String toString(){

        String stringRetorno = "---------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno += "---------------\n";

        No noAuxiliar = refNoEntradaPilha;

        if (!isEmpty()){
            while (true){
                if(noAuxiliar != null){
                    stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                    noAuxiliar = noAuxiliar.getRefNo();
                } else{
                    break;
                }
            }
        }
        stringRetorno += "===============\n";

        return stringRetorno;
    }
}
