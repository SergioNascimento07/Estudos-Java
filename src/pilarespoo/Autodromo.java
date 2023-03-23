package pilarespoo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        // jeep.confereCambio();
        // jeep.confereCombustivel();
        jeep.setChassi("923812");
        System.out.println(jeep.getChassi()); 
        jeep.ligar(); // encapsula os outros metodos

        Moto z400 = new Moto();
        z400.setChassi("192423");
        z400.ligar();
        System.out.println(z400.chassi);
        System.out.println(z400.getChassi());
    }
}
