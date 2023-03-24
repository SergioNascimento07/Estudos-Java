package generics.wildcardspraticos;

import java.util.ArrayList;
import java.util.List;

abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal{
    public void consulta(){
        System.out.println("Consultando cachorro");
    }
}

class Gato extends Animal{
    public void consulta(){
        System.out.println("Consultando gato");
    }
}

public class WildCardTest {
    public static void main(String[] args) {
        Cachorro[] listaCachorro = {new Cachorro(), new Cachorro()};
        Gato[] listaGato = {new Gato(), new Gato()};

        consultarAnimais(listaGato);
        consultarAnimais(listaCachorro);
        // Animal[] listaAnimais = {new String("2"),new Cachorro(), new Gato()}; -- não é possivel pois String não faz parte da hierarquia 
        // Só é possivel adicionar ao array da classe, Objetos que fazem parte da hierarquia 
        Animal[] listaAnimais = {new Cachorro(), new Gato()};
        for (Animal animais: listaAnimais){
            System.out.println("");
            animais.consulta();
        }


        //TESTE COM COLEÇOES
        List<Cachorro> cachorros = new ArrayList<>();
        cachorros.add(new Cachorro());
        cachorros.add(new Cachorro());
        // consultaAnimalList(cachorros); -- não é possivel
        consultaAnimaisListCorrect(cachorros);
    }
    //Em arrays é possivel passar como parametros filhos/herdeiro da classe requerida
    public static void consultarAnimais(Animal[] animals){
        for (Animal animal: animals){
            animal.consulta();
        }
        // animals[1] = new Gato(); não é possivel definir diretamente em lista outras classes que não sejam a definida
    }

    //com colecao se pede lista de animais precisa passar lista de animais
    public static void consultaAnimalList(List<Animal> animals) {
        for (Animal animais: animals){
            animais.consulta();
        }
    }

    public static void consultaAnimaisListCorrect(List<? extends Animal> animals){
        for (Animal animais: animals) {
            animais.consulta();
        }
    }
}
