package ioarquivos.adicionararquivo;

import java.io.*;
//copia arquivo
public class Main {
    public static void copiaArquivo() throws IOException {

        File f = new File("recomendacoes.txt");
        String nomeDoArquivo = f.getName();
        
        FileReader r = new FileReader(nomeDoArquivo);
        BufferedReader br = new BufferedReader(r);
        String line = br.readLine();
        
        String nomeArquivoCopy = nomeDoArquivo.substring(0, nomeDoArquivo.indexOf(".")).concat("-copy.txt");
    
        File fcopy = new File(nomeArquivoCopy);
        BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivoCopy));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(!(line == null));

        bw.flush();

        System.out.println("recomende mais livros");

        adicionarConteudo(fcopy.getName());
    }

    public static void adicionarConteudo(String arquivo) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        //true como parametro para append -- onde podemos adicionar conteudo
        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));
        
        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while(!line.isEmpty());
        bw.flush();

        System.out.println("Arquivo modificado com sucesso, conteudos foram adicionados");
    }
    public static void main(String[] args) throws IOException {
        copiaArquivo();
    }
}
