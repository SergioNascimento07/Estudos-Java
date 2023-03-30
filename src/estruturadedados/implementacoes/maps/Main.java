package estruturadedados.implementacoes.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Map<chave, valor>
        //Map cria um objeto do javaScript
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        // aluno.put("Nome", "João");
        //se der um put com chave existente ele sobrescreve a chave com o novo valor
        System.out.println(aluno);

        System.out.println(aluno.containsKey("Nome"));
        //ve se contem aquela chave

        System.out.println(aluno.keySet()); 
        //retorna todas as chaves que tem nessa estrutura em collection == List
        
        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Ricardo");
        aluno2.put("Idade", "19");
        aluno2.put("Media", "9.0");

        List<Map<String, String>> listaAlunos = new ArrayList<>();
        
        listaAlunos.add(aluno);
        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

    }
}
