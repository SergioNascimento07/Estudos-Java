package estoque;

import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        int tempIdProduto;
        int tempQuantidade;
        String tempNome;
        double tempPreco;

        Scanner sc = new Scanner(System.in);

        Produto[] produtos = new Produto[2];

        for (int i = 0; i<2; i++){
            System.out.println("Digite o Id do produto");
            tempIdProduto = sc.nextInt();
            
            System.out.println("Digite a quantidade do produto");
            tempQuantidade = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Digite o nome do produto");
            tempNome = sc.nextLine(); //nextLine pega tudo ate o espaço
            // next so pega ate o espaco

            System.out.println("Digite o preço do produto");
            tempPreco = sc.nextDouble();
            Produto p1 = new Produto(tempIdProduto, tempNome, tempPreco, tempQuantidade);
            produtos[i] = p1;
        }

        //Produto é a classe de cada produto
        for (Produto produto: produtos){
            System.out.println(produto);
        }
        sc.close();
    }
}
