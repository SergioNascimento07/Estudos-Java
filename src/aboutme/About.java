package aboutme;

public class About {
    public static void main(String[] args) {

        String nome = args[0];
        int idade = Integer.valueOf(args[1]);
        double altura = Double.valueOf(args[2]);

        System.out.println(args);
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);
    }
}
