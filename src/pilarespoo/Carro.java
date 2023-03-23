package pilarespoo;

public class Carro extends Veiculo{

    public Carro() {

    }

    public void ligar() {
        this.confereCambio(); // Encapsulamento
        this.confereCombustivel();
        System.out.println("Carro ligado");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustivel");
    }

    private void confereCambio() {
        System.out.println("Conferindo câmbio");
    }
}
