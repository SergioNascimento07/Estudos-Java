package aboutme;

import java.util.Scanner;
import java.util.Locale;

public class About {
    public static void main(String[] args) {

        // String nome = args[0];
        // int idade = Integer.valueOf(args[1]);
        // double altura = Double.valueOf(args[2]);

        // System.out.println(args);
        // System.out.println(nome);
        // System.out.println(idade);
        // System.out.println(altura);

        // Classe Scanner -- p leitura de argumentos pelo terminal

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        // new scanner = sistema.entrada e use locale tipo americano para double
        System.out.println("Digite seu nome");
        String nome = scanner.next(); 
        // entrada == scanner.next()
        //scanner.next e tipo caso nao seja string
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        Double altura = scanner.nextDouble();
        
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
        scanner.close();
    }
}
