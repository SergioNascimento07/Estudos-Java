package estruturadedados.listas.listacircular;

public class No<T> {
    
    private T conteudo;
    private No<T> refProximoNo;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.refProximoNo = null;
    }

    public T getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getRefProximoNo() {
        return this.refProximoNo;
    }

    public void setRefProximoNo(No<T> proximoNo) {
        this.refProximoNo = proximoNo;
    }
}
