package estruturadedados.implementacoes.queue;

import java.util.Objects;

class Carro {
    
    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public boolean equals(Object o){
        if (this == o) return true; //testa se o objeto instanciado é igual o outro
        
        if (o == null || getClass() != o.getClass()) return false;

        Carro carro = (Carro) o; //cria objeto carro e faz cast do obj passado por parametro
        return Objects.equals(this.marca, carro.marca);
    }

    public int hashCode() { //retorna um hash
        return Objects.hash(marca);
    }

    public String toString() {
        return "Carro{" + marca + "}";
    }
}
