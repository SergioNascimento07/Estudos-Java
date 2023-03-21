// O nome do arqivo é o mesmo da classe
// O arquivo é basicamente uma classe
package primeiroexercicio;
public class MinhaClasse {
     //precisa declarar aqui fora
    // e definir dentro do metodo
    // oudeclarado e definido dentro do metodo
    public static void main(String[] args) {
        double num = 4.231;
        num = (int) num; // não é possivel fazer casting para String
        System.out.println(num);
        // else é igual no javaScript
        String nomeCompleto = nomeCompleto("joão", "Almeida");
        System.out.println(nomeCompleto);

        int mediaFinal = 6;
        if (mediaFinal == 5 || mediaFinal == 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Não aprovado");
        }
    }
    //não da pra usar o this em metodos estaticos

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
