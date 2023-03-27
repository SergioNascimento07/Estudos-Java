package estruturadedados.fila;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        Fila minhaFila = new Fila();

        //aceita qualquer tipo de dado pois objecy é a classe primária de todas
        minhaFila.enqueue(new No("Primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));
        minhaFila.enqueue(new No("quinto"));
        minhaFila.enqueue(new No("sexto"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println("Primeiro da fila retirado=" + minhaFila.dequeue() );

        System.out.println(minhaFila.multDequeue(3));
    }
}
