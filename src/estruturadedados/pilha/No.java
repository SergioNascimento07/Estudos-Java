package estruturadedados.pilha;

public class No {
    
    private int dado;
    private No refNo = null;

    public No(int dado) {
        this.dado = dado;
    }

    public void setDado(int dado){
        this.dado = dado;
    }

    public int getDado(){
        return this.dado;
    }

    public void setRefNo(No refNo){
        this.refNo = refNo;
    }

    public No getRefNo(){
        return this.refNo;
    }

    public String toString() {
        return "No{" + "dado=" + dado + "}";
    }
}
