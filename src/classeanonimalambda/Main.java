package classeanonimalambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Gato{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    
    public String getNome() {
        return this.nome;
    }
    public Integer getIdade() {
        return this.idade;
    }
    public String getCor() {
        return this.cor;
    }

    public String toString() {
        return "{" + this.nome + ", " +  this.idade + ", " + this.cor + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        //Classe anonima para passar o comparator para o array

        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("a", 12, "aaaa"));
            add(new Gato("b", 19, "dddd"));
            add(new Gato("c", 15, "cccc"));
            add(new Gato("d", 13, "xxxx"));
            add(new Gato("e", 11, "gggg"));
            add(new Gato("f", 14, "hhhh"));
        }};
    
        //quando precisa passar uma classe como param
        //que vai ser usada apenas uma vez
        gatos.sort(new Comparator<Gato>() {
            public int compare(Gato o1, Gato o2) {
                return Integer.compare(o1.getIdade(), o2.getIdade());
            }
            
        });

        System.out.println(gatos);
        
        //forma de fazer com lambda
        //funcao anonima
        gatos.sort(Comparator.comparing((Gato gato) -> gato.getNome()) );
        System.out.println(gatos);

        //usando reference methods
        //simplifica expressao lamba
        //troca flecha por :: e nao precisa passar parenteses pq sabe que é um metodo
        gatos.sort(Comparator.comparing(Gato::getCor));
        System.out.println(gatos);

    }
}
