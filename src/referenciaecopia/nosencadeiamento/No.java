package referenciaecopia.nosencadeiamento;

public class No {
    private String conteudo;
    private No proximoNo;

    public No(String conteudo){
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public void setConteudo(String conteudo){
        this.conteudo = conteudo;
    }

    public String getConteudo(){
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
