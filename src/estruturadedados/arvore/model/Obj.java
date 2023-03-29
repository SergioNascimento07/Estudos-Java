package estruturadedados.arvore.model;

public class Obj extends ObjArvore<Obj>{
    private Integer meuValor;

    public Obj(Integer meuValor){
        this.meuValor = meuValor;
    }
    
    public Integer getValor() {
        return this.meuValor;
    }

    public int compareTo(Obj outro) {
        int i = 0;

        if(this.meuValor > outro.meuValor){
            i = 1;
        }else if(this.meuValor < outro.meuValor){
            i = -1;
        }
        return i;
    }

    public String toString(){
        return  ""+this.meuValor;
    }
}
