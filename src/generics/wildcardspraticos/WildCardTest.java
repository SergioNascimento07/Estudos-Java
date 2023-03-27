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

        List<Gato> gatos = new ArrayList<>();
        gatos.add(new Gato());
        gatos.add(new Gato());

        List<Animal> animais = new ArrayList<>();
        animais.add(new Gato());
        animais.add(new Cachorro());
        metodoGeralList(animais);

        //TESTE COM COLEÇOES
        List<Cachorro> cachorros = new ArrayList<>();
        cachorros.add(new Cachorro());
        cachorros.add(new Cachorro());
        
        // consultaAnimalList(cachorros); -- não é possivel
        consultaAnimaisListCorrect(cachorros);
        metodoGeralList(cachorros);
        metodoGeralList(gatos);
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
        animals.add(new Cachorro());
        animals.add(new Gato());
        // animals.set(0, new Gato()); -- funciona
    }

    
    //todo metodo que usa o caracter coringa promete que nao vai adicionar nada
    public static void consultaAnimaisListCorrect(List<? extends Animal> animals){
        for (Animal animais: animals) {
            animais.consulta();
        }
        //animals.add(new Cachorro()); -- Não permite adicionar classes assim
    }

    public static void AdicionarCachorrList(List<? super Cachorro> animals){
        animals.add(new Cachorro());
        //Aceita adicionar cachorro pois essa classe permite tudo que é cachorro ou pai dele
    }
    
    
    public static void metodoGeralList(List<?> classe){
        classe.get(0);
        for (Object obj: classe){
           System.out.println(obj.getClass());
        }
    }
}
