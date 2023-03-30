package collections.arraylinkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

public class Main {
    public static void main(String[] args) {
        //forma de instanciar já com valores
        List<Integer> listaNum = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        
        System.out.println(listaNum);

        //Instanciando dessa forma elas se tornam listas imutaveis
        List<Integer> listaNum2 = Arrays.asList(1,2,3,4,5,6,7);

        List<Integer> listaNum3 = List.of(1,2,3,4,5,6,7);



        List<Double> notas = new ArrayList<>();
        //metodo add pode passar so elemento ou indice e elemento
        notas.add(5d); //para entender Double coloca .o ou d no final
        
        //se passar indice que não existe dá erro
        notas.add(1, 4.2);
        notas.add(9.5);
        notas.add(7.5);

        System.out.println(notas.indexOf(7.5));
        
        System.out.println(notas);

        //set substiui elemento
        notas.set(0, 1.0);
        System.out.println(notas);

        System.out.println(notas.contains(5.0));

        System.out.println(notas.get(2));

        //Para exibir a menor item da lista
        System.out.println(Collections.min(notas));

        System.out.println(Collections.max(notas));

        //p pegar soma das notas
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){ //pergunta ao iterator se tem proximo
            Double next = iterator.next(); //Se tiver elemento ele passa o valor
            soma += next;
        }
        System.out.println(soma);
        

        //Exibir media das notas
        System.out.println("Média é " + (soma/notas.size()));
    
        notas.remove(1.0);
        //O remove pode passar index ou objeto
        System.out.println(notas);

        //iterador sobre a lista
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()) {
            Double next = iterator2.next();
            if(next<7){
                iterator2.remove(); //remove o item sobre qual está sendo iterado
            }
        }

        System.out.println(notas);

        //PARA APAGAR TODOS OS ITENS

        notas.clear();
        System.out.println(notas);

        System.out.println(notas.isEmpty());
    }
}
