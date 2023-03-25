package referenciaecopia.nosencadeiamento;

public class No<T>{
    private T conteudo;
    private No<T> proximoNo;

    public No(T conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo(){
        return this.conteudo;
    }

    public void setProximoNo(No proximoNo){
        this.proximoNo = proximoNo;
    }

    public No getProximoNo(){
        return this.proximoNo;
    }

    public String toString() {
        return "Nó: " + conteudo + ", proximoNo: " + proximoNo;
    }
}
