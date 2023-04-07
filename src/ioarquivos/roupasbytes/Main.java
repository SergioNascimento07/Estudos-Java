package ioarquivos.roupasbytes;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void incluirProduto() throws IOException {
        File f = new File("roupa.bin");
    
        System.out.println("");

        OutputStream os = new FileOutputStream(f.getName());
        
        //dataOutputStream e BufferedOutpuStream da no mesmo
        DataOutputStream dos = new DataOutputStream(os);

        Scanner scan = new Scanner(System.in);
        System.out.println("digite o nome da peça: ");
        
        
        String nome = scan.nextLine();
        dos.writeUTF(nome);

        System.out.println("Tamanho da peça [P/M/G]: ");
        char tamanho = (char) System.in.read();
        dos.writeChar(tamanho);

        System.out.println("Quantidade: ");
        int qtde = scan.nextInt();
        dos.writeInt(qtde);

        lerProduto(f.getName());
    }

    //LEITURA DE ARQUIVO ".BIN"
    public static void lerProduto(String arquivo) throws IOException {
        File f = new File(arquivo);

        DataInputStream dis = new DataInputStream(new FileInputStream(f.getName()));

        String nome = dis.readUTF();
        char tamanho = dis.readChar();
        int qtde = dis.readInt();

        System.out.println(nome);
        System.out.println(tamanho);
        System.out.println(qtde);
        
    }

    public static void main(String[] args) throws IOException {
        incluirProduto();
    }
}
