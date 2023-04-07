package ioarquivos.filmesio;

import java.io.*;

public class Main {
    public static void receberTecladoImprimirConsole() throws IOException {
        // //entrada é um objeto da classe inputStream
        // InputStream is = System.in;

        // //convertendo para caracter
        // InputStreamReader isr = new InputStreamReader(is); //passa o objeto de entrada do sistema
        
        // //armazenando em um buffer
        // BufferedReader br = new BufferedReader(isr);


        //forma simplificada, o mesmo que foi passado ali
        System.out.println("Recomende 3 filmes");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine(); //metodo le cada linha digitada
    
        OutputStream os = System.out;
        //cria um escritor com system.out
        OutputStreamWriter osw = new OutputStreamWriter(os);
        //BufferedWriter é oq guarda essas entradas para escrever no console depois
        BufferedWriter bw = new BufferedWriter(osw);

        do {
            bw.write(line);
            bw.newLine(); //proxima linha prepara
            line = br.readLine(); //le uma entrada
        } while(!line.isEmpty()); //verifica se a linha está vazia
        bw.flush(); //para descarregar no console oq foi armazenado e escrito
        
        bw.close();
        br.close();
    }
    public static void main(String[] args) throws IOException {
        receberTecladoImprimirConsole();
    }
}
