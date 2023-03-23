package pilarespoo;

//extends é a forma de herdar outra classe
//extend -- herda metodos e atributos de veiculo
public class Moto extends Veiculo{
    public void ligar(){
        System.out.println("ligando moto: " + chassi);
    };
}
