package classeenum;  

public class IniciaFilme {
    public static void main(String[] args) {
        //Classe.values() -- pega os objetos predefinidos
        for(Filme e: Filme.values()){
            System.out.println(e);
        }

        // Forma de instanciar enum 
        Filme shrek = Filme.SHREK;
        System.out.println(shrek);

    }
}
