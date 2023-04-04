package trycatch.unchecked;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //JOptionPane é para criar caixas de dialogos
        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println(resultado);
                continueLooping = false;
            } catch(NumberFormatException e) { //se inserir algo que não é um número
                JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro");
                e.getMessage();
            } catch(ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossivel dividir número por 0");
            }
        } while(continueLooping);
        
    }

    public static int dividir(int a, int b) {return a/b;}
}
