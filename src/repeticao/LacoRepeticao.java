package repeticao;
import java.util.ArrayList;

public class LacoRepeticao {
    public static void main(String[] args) {
        //repeticao aqui é igual js

        String[] alunos = new String[4];
        alunos[0] = "sergio";
        System.out.println(alunos[0]);

        ArrayList<String> minhaLista = new ArrayList<String>(3);
        minhaLista.add("10");
        minhaLista.add("20");
        minhaLista.add("30");
        System.out.println(minhaLista.get(2)); 
        // forma de  trabalhar com classe Array

        String[] alunosNovo = {"Sergio", "Augusto", "Jorge"};
        // nao da pra aumentar o tamanho de um array depois de definir
        // for iterando sobre array
        // aluno é cada objeto do array
        for (String aluno : alunosNovo){
            System.out.println(aluno);
        }
        //break e continue 

        
    }
}
