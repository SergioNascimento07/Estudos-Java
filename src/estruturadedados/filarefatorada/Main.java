package estruturadedados.filarefatorada;

public class Main {
    public static void main(String[] args) {
        Fila minhaFila = new Fila();

        //aceita qualquer tipo de dado pois objecy é a classe primária de todas
        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");
        minhaFila.enqueue("quinto");
        minhaFila.enqueue("sexto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println("Primeiro da fila retirado=" + minhaFila.dequeue() );

        System.out.println(minhaFila.multDequeue(3));
    }
}
