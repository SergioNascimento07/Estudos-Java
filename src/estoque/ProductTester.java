package estoque;

public class ProductTester {
    public static void main(String[] args) {
        Produto livro = new Produto(1, "hobbit", 25.95, 3);
        System.out.println(livro);
        System.out.println(livro.getNome());    
        
    }
}
