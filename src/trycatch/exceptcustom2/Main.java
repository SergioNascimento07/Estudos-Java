package trycatch.exceptcustom2;

class DivisaoNaoExataException extends Exception {

    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String message,int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] numerador = {4,5,8,10};
        int[] denominador = {2,4,0,2,8};

        for (int i = 0; i<denominador.length; i++) {
            try {
                if (numerador[i] %2 != 0) throw new DivisaoNaoExataException("Divisão não exata", numerador[i], denominador[i]);
                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            }  catch(DivisaoNaoExataException e) {
                System.out.println(e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
                
        }

        System.out.println("Programa continuando, excep ou não");
    }
}
