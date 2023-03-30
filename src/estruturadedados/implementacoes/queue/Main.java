package estruturadedados.implementacoes.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    
    public static void main(String[] args) {
        
        Queue<Carro> filaCarro = new LinkedList();

        filaCarro.add(new Carro("a"));
        filaCarro.add(new Carro("b"));
        filaCarro.add(new Carro("c"));
        filaCarro.add(new Carro("d"));

        System.out.println(filaCarro);

        filaCarro.offer(new Carro("a"));
        //um add onde se não adicionar retorna false

        System.out.println(filaCarro);

        System.out.println(filaCarro.peek());
        //mostra o primeiro carro da fila

        filaCarro.poll();
        filaCarro.poll();

        System.out.println(filaCarro);

        System.out.println(filaCarro.size());

    }
}
