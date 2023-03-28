package estruturadedados.filarefatgeneric;
//com wildCards podemos nao definir e inserir qualquer coisa
//ou definir um tipo
public class Main { 
    public static void main(String[] args) {
        Fila<Integer> minhaFila = new Fila();

        //aceita qualquer tipo de dado pois objecy é a classe primária de todas
        minhaFila.enqueue(1);
        minhaFila.enqueue(2);
        minhaFila.enqueue(3);
        minhaFila.enqueue(4);
        minhaFila.enqueue(5);
        minhaFila.enqueue(6);

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println("Primeiro da fila retirado=" + minhaFila.dequeue() );

        System.out.println(minhaFila.multDequeue(3));
    }
}
