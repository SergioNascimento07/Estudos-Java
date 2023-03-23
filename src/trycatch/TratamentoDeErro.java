package trycatch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeErro {
    
    public static void main(String[] args) {
        try {    
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Digite seu nome:");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            System.out.println(nome.toUpperCase()+sobrenome.toLowerCase());
            System.out.println(idade);
            System.out.println(altura);
            scanner.close();
        } catch (InputMismatchException e) { //nome da excecao e o "e";
            //MismathException == quando insere algo que não é numerico em campos numericos
            System.out.println("Campos idade e altura precisam ser numeros");
            // System.err.println("Campos idade e altura precisam ser numeros"); //mesma coisa q out
        } 
    }
}
