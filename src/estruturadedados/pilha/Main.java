package estruturadedados.pilha;

public class Main {
    public static void main(String[] args) {

        Pilha minhPilha = new Pilha();

        minhPilha.push(new No(1));
        minhPilha.push(new No(2));
        minhPilha.push(new No(3));
        minhPilha.push(new No(4));
        minhPilha.push(new No(5));
        minhPilha.push(new No(6));
        minhPilha.push(new No(7));

        System.out.println(minhPilha.pop());
        minhPilha.push(new No(84));

        System.out.println(minhPilha);
        
    }   
}
