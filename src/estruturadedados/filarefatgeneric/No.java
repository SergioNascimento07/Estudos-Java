package estruturadedados.filarefatgeneric;
//UTILIZANDO GENERICS
public class No<T>{
    
    private T object;
    private No refNo;
    
    public No(){
    }

    public No(T object){
        this.object = object; //conteudo do nó
        this.refNo = null;
    }

    public Object getObject(){
        return this.object;
    }

    public void setObject(T object){
        this.object = object;
    }

    public No getRefNo(){
        return this.refNo;
    }

    public void setRefNo(No refNo){
        this.refNo = refNo;
    }

    public String toString(){
        return "No{" + "object=" + object + "}";
    }
}
