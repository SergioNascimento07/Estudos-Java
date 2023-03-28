package estruturadedados.listas.listaduplamenteencadeada;

public class NoDuplo<T> {
    
    private T conteudo;
    private  NoDuplo<T> noProximo;
    private NoDuplo<T> noPrevio;

    //se nao for declarado fica como null

    public NoDuplo(T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo(){
        return this.conteudo;
    }

    public void setConteudo(T newConteudo){
        this.conteudo = newConteudo;
    }

    public NoDuplo<T> getNoPrevio() {
        return this.noPrevio;
    }

    public void setNoPrevio(NoDuplo<T> novoNo){
        this.noPrevio = novoNo;
    }

    public NoDuplo<T> getNoProximo() {
        return this.noProximo;
    }

    public void setNoProximo(NoDuplo<T> novoNo){
        this.noProximo = novoNo;
    }

    public String toString() {
        return "NoDuplo{" + "conteudo= " + this.conteudo + "}";
    }
}
