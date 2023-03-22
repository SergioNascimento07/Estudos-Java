package condicionais;

import java.lang.management.MemoryUsage;

public class Condicionais {
    public static void main(String[] args) {
        // condicional simples
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }

        System.out.println("Cond simples:" + saldo);

        // condicional composta
        int nota = 6;

        if (nota>=7) {
            System.out.println("Passou");
        } else {
            System.out.println("Reprovou");
        }

        // condicional encadeada -- if e mais de um else if
        
        
        //Operadores ternários
        System.out.println(nota>=7?"Aprovado":"Reprovado");

        //SWITCH CASE
        int meuNumero = 1;

        switch (meuNumero) {
            case 1:
                System.out.println("o numero é 1");
                break;
            case 12:
                System.out.println("O numero é 12");
                break;
            default:
                System.out.println("nenhum");
        }
    }
}
