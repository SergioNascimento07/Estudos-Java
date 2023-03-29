package estoque;
//adicionar lista feita na estrutura de dados
import java.util.ArrayList;
import java.util.Scanner;

public class ProductTester {

    private static Scanner scanner;
    private static ArrayList<Produto> productList;
    
    public static void main(String[] args) {
        int opcao;
        scanner = new Scanner(System.in);
        productList = new ArrayList<>();

        do {
           opcao = menu();
           
           switch (opcao) {
            case 1:
                cadastrar();
                break;

            case 2:
                adicionar();
                break;

            // case 3:
            //     remover();
            //     break;
            
            // case 4:
            //     alterar();
            //     break;

            case 5:
                listar();
                break;
           }
        } while(opcao != 6);
    }
    
    public static int menu(){

        int opcao = 0;
        System.out.println("**** Controle de inventário");
        System.out.println("1. Cadastrar");
        System.out.println("2. Adicionar");
        System.out.println("3. Remover");
        System.out.println("4. Modificar");
        System.out.println("5. Listar");
        System.out.println("6. Encerrar programa");

        System.out.print("Informe uma opção: ");
        
        try {
            opcao = scanner.nextInt();
        } catch(Exception e) { //excecao generica
            e.printStackTrace();
            opcao=0;
        }
        
        clearCache();
        return opcao;
    }

    public static void clearCache() {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

    public static void cadastrar() {
        int idProduto;
        int quantidade;
        String nome;
        double preco;
        boolean estado;

        try {
            System.out.print("Digite o Id do produto: ");
            idProduto = scanner.nextInt();
          
            System.out.print("Digite a quantidade do produto: ");
            quantidade = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Digite o nome do produto: ");
            nome = scanner.nextLine(); //nextLine pega tudo ate o espaço
            // next so pega ate o espaco

            System.out.print("Digite o preço do produto: ");
            preco = scanner.nextDouble();

            System.out.print("Digite o estado do produto: ");
            estado = scanner.nextBoolean();
        } catch(Exception e){
            System.err.println("Erro nos valores digitados, tente novamente");
            return;
        }

        Produto produto = new Produto(idProduto, nome, preco, quantidade, estado);
        productList.add(produto);
    }

    public static void listar() {
        for (Produto produto: productList) {
            System.out.println(produto);
        }
    }

    private static void adicionar(){
        int idProduto;
        int quantidade;

        try {
            System.out.print("Informe o número do produto");
            idProduto = scanner.nextInt();
            System.out.print("Insira a quantidade de produtos que você gostaria de inserir");
            quantidade = scanner.nextInt();
            for (Produto produto: productList) {
                if (produto.getIdProduto() == idProduto){
                    produto.setQuantidade(produto.getQuantidade() + quantidade);
                }
            }
            return;
        } catch(Exception e) {
            System.err.println("Erro nos valores digitado");
        }
    }

    // public static void main(String[] args) {
    //     int tempIdProduto;
    //     int tempQuantidade;
    //     String tempNome;
    //     double tempPreco;
    //     boolean tempEstado;

    //     Scanner sc = new Scanner(System.in);

    //     Produto[] produtos = new Produto[2];

    //     for (int i = 0; i<2; i++){
    //         System.out.println("Digite o Id do produto");
    //         tempIdProduto = sc.nextInt();
            
    //         System.out.println("Digite a quantidade do produto");
    //         tempQuantidade = sc.nextInt();
    //         sc.nextLine();
            
    //         System.out.println("Digite o nome do produto");
    //         tempNome = sc.nextLine(); //nextLine pega tudo ate o espaço
    //         // next so pega ate o espaco

    //         System.out.println("Digite o preço do produto");
    //         tempPreco = sc.nextDouble();

    //         System.out.println("Digite o estado do produto");
    //         tempEstado = sc.nextBoolean();
    //         Produto p1 = new Produto(tempIdProduto, tempNome, tempPreco, tempQuantidade, tempEstado);
    //         produtos[i] = p1;
    //     }

    //     //Produto é a classe de cada produto
    //     for (Produto produto: produtos){
    //         System.out.println(produto);
    //     }
    //     sc.close();
    // }
}
