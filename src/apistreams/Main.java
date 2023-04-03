package apistreams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // numeros.removeIf(integer -> (integer % 2 != 0)); -- não está funcionando
        // System.out.println(numeros);

        //não da pra sobrescrever os itens da lista com forEach
        //somente com map e usando list pra isso
        numeros.forEach(num -> System.out.print(num+1));

        System.out.print(numeros + " ");

        // OPERACOES STREAM
        numeros.stream()
            .limit(5) // pega os primeiros 6 elementos
            .collect(Collectors.toSet()) //coloca esses valores em um set //collectors pega os elementos // toSet transforma em um set
            .forEach(System.out::print);

        Set<Integer> novos = numeros.stream()
                                    .limit(8)
                                    .collect(Collectors.toSet());
            
        System.out.println(novos);

        //map so é aplicado em list
        List<Integer> ala = numeros.stream().map(num -> num = num+2).collect(Collectors.toList());
        System.out.println(ala);


        List<Integer> maisUm = ala.stream()
                                        //.map(num -> num = (int) num) //stream de numeros inteiros definido
                                        .filter(num -> num >10)
                                        .collect(Collectors.toList());
                     
        System.out.println(maisUm);


        List<String> numeros2 = Arrays.asList("1", "2", "3", "4", "5", "6","7");
        OptionalDouble aqui = numeros2.stream()
            .mapToInt(Integer::parseInt)
            .average();
            // .ifPresent(System.out::print);
                // .mapToInt(s -> Integer.parseInt()) caso tivesse em outro tipo
                //options serve tb para trabalhar com retornos nulos
        System.out.println(aqui);
        
    }
}
