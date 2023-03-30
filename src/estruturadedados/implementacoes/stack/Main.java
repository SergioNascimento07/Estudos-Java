package estruturadedados.implementacoes.stack;
//Stack == pilha;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("a"));
        stackCarros.push(new Carro("b"));
        stackCarros.push(new Carro("c"));
        stackCarros.push(new Carro("d"));

        System.out.println(stackCarros);
        stackCarros.pop(); //tira topo da pilha
        System.out.println(stackCarros);
        System.out.println(stackCarros.peek());//para olhar somente o topo da pilha sem nenhuma ação
        System.out.println(stackCarros.empty());
        
    }
}
