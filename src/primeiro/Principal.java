package primeiro;

import java.util.Random;

public class Principal{
    //variavais dentro de metodo estatico sao privadas
    // nao da pra definir variavel fora e definir dentro de met estatic
    public static void main(String[] args) {
        int num = 7;
        num = 3;

        do {
            System.out.println(num);
            num++;
        } while (num <= 5);

        String word = "a";
        String word2 = "d";
        System.out.println(word);

        System.out.println(word.compareTo(word2));

        do {
            System.out.println("Telefone tocando");
        } while(tocando());

        System.out.println(new Random().nextInt());
        //ver melhor como funciona o metodo nextInt()
    }

    public static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);

        return !atendeu;
    }
}