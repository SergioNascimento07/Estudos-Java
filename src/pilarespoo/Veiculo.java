package pilarespoo;


//Classe abstrata é aquela que estabelece metodos para serem herdados que nao seram definidos antes
// abstract class -- não define todos os metodos
//pode criar metodo sem definir para ser definido pelo filho que herdar
//funciona sem abstract tb, mas abstract torna obrigatório classe que herdar definir esse ou esses metodos abstratos
public abstract class Veiculo {
    protected String chassi;
    //protected tambem torna publica na classe herdeira ou default?
    //Protected torna variavel assecivel a herdeiro, so da pra usar assim
    protected void setChassi(String chassi){
        this.chassi = chassi;
    }
    //private não passa metodo nem para a classe filha
    protected String getChassi() {
        return this.chassi;
    }

    protected abstract void ligar();
    //metodo sera definido depois
}
