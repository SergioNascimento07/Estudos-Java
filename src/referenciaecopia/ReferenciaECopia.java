package referenciaecopia;

public class ReferenciaECopia {
    public static void main(String[] args) {
        // atribuicao de tipos primitivos sempre gerarao copia verdadeira
        // e independente 
        int num1 = 33;
        int num2 = num1;
        num2 = 10;
        num1 = 23;
        System.out.println(num1);
        System.out.println(num2);

        //Objetos criam referencia nova, nao cópia
        //novo2 mexe no novo pq apontam p mesmo lugar
        MeuObjeto novo = new MeuObjeto(15);
        MeuObjeto novo2 = novo;

        System.out.println(novo.num);
        System.out.println(novo2.num);

        novo2.num = 43;

        System.out.println(novo.num);
        System.out.println(novo2.num);
    }
}
