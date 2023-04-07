package ioarquivos.objectio;

import java.io.*;

class Gato implements Serializable{
    public String nome;
    public Integer idade;
    
    public Gato(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Gato() {
    }


}

public class Main {
    public static void serealizacao() throws FileNotFoundException, IOException {
        Gato gato = new Gato("simba", 15);

        File f = new File("gato");

        ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream(f.getName()));
        obs.writeObject(gato);

        System.out.println("Objeto Gato armazenado");

        obs.close();
    }

    public static void desserealizacao(String arquivo) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
        Gato objetopGato = (Gato) ois.readObject(); 
        //retorna um objeto

        System.out.println(objetopGato.nome);
        System.out.println(objetopGato.idade);
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        serealizacao();
        desserealizacao("gato");
    }
}
