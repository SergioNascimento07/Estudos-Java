package ioarquivos.filmestxt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

//se rodar mais de uma vez ele sobrescreve, não adiciona

public class Main {
    public static void leituraImperssaoTxt() throws IOException {

        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        
        //tem opcao autoFlush para printar ao definir o pw.println
        PrintWriter pw = new PrintWriter(System.out); //aberto fluxo para escrita no console
        pw.println("Digite recomendações de filmes: ");
        pw.flush(); //descarrega e coloca no console

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        File f = new File("recomendacoes.txt");
        //quando iniciar o file ele cria documento na pasta do diretorio principal
        //classe file nao cria documento, quem cria é o fileWriter

        BufferedWriter bw = new BufferedWriter(new  FileWriter(f.getName()));
        //ta pegando so o nome do arquivo

        do {
            bw.write(line);
            bw.newLine();
            
            line = scan.nextLine();
        } while(!line.equalsIgnoreCase("fim"));
        bw.flush();
        //quando fecha ele descarrega automaticamente
        pw.close();
        bw.close();
        br.close();

    }

    public static void main(String[] args) throws IOException {
        leituraImperssaoTxt();
    }
}
