package trycatch;
import java.util.Scanner;
public class FormatadorDeCep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite um cep");
            String cep = scanner.next();
            String cepFormatado = formatarCep(cep);
            System.out.println(cepFormatado);
            scanner.close();
        } catch(CepInvalidoException e) { //Classe de exceção
            System.out.println("O cep não corresponde às regras");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8) //condicao para lançamento da excecao
            throw new CepInvalidoException(); 

        return "3232233";
    }
}
