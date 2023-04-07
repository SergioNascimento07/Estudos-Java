package ioarquivos.leituraescriabytes;

import java.io.*;

//copia do arquivo "recomendacoes-copy.txt"
//Bytes -- entrada e saida de bytes
public class Main {
    public static void copiarArquivo() throws IOException {
        File f = new File("recomendacoes-copy.txt");
        String nomeArquivo = f.getName();
        
        InputStream is = new FileInputStream(f.getName());
        

        BufferedInputStream bis = new BufferedInputStream(is);
        //abertura do nosso documento

        String nomeArquivoCopy = nomeArquivo.substring(0, nomeArquivo.indexOf("-")).concat("-copy2.txt");

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nomeArquivoCopy));
        
        //como são bytes a leitura é 0 e 1, quando o bit é lido como -1 significa null
        int line = 0;
        while((line = bis.read()) != -1) {
            System.out.println(line);
            bos.write((char) line);
            System.out.println((char) line);
            bos.flush();
        }

        bis.close();
        bos.close();
    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
    }
}
