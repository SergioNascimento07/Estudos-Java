package trycatch;

import java.text.NumberFormat;
import java.text.ParseException;
//Exceptions exigem que o trycatch seja feito
public class Exceptions {
    public static void main(String[] args) {
        try{ 
            String essa = "132,54";
            //NumberFormat.getInstance().parse(valor) == passa string p numero
            Number valor = NumberFormat.getInstance().parse(essa);
            System.out.println(valor);
        } catch(ParseException e) {
            System.out.println("valor errado,  não pode ser mudado");
        }
    }
}
