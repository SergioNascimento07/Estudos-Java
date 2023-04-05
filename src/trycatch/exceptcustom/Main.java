package trycatch.exceptcustom;

import java.io.*;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws IOException {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo: ");
        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("Programa continuando, excep ou não");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
       
        try  {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do{
                bw.write(line);
                bw.newLine();
                line=br.readLine();
            } while(line != null);
            bw.flush(); //como ta armazenado no buffer, esse comando descarrega ele
            br.close();
            //se colocar bw.close fecha a saida de dados para o console
        } catch (ExceptCustomAbertura e) { //não funciona pois ela é lançada pela FileNotFoundException
            JOptionPane.showMessageDialog(null,e.getMessage());
            e.printStackTrace(); //necessario colocar acima do catch de IoException
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } 
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ExceptCustomAbertura{
        File file = new File(nomeDoArquivo);
        //classe file tem metodo getPath() p pegar nome do diretorio
        try {
            return new BufferedReader(new FileReader(file.getName()));
        } catch (FileNotFoundException e) {
            throw new ExceptCustomAbertura(file.getName(), file.getPath());
            //pede pra tratar ou lancar exception 
        }
    }
}

class ExceptCustomAbertura extends Exception {
    private String nomeDoArquivo;
    private String diretorio;

    public ExceptCustomAbertura(String nomeDoArquivo, String diretorio) {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório" + diretorio + " ");
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    public String toString() {
        return "ExceptionCustomAbertura{" +
        "nomeDoArquivo=" + nomeDoArquivo +
        ", diretorio=" + diretorio + "}";
    }

    // public synchronized Throwable getCause() {
    //     return super.getCause();
    // }
}
