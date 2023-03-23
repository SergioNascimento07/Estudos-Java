package interfaces.equipamentos.copiadora;

//implements é para classes do tipo interface
//implements torna obrigatório implementar e definir método presente na interface

public class Xerox implements Copiadora{
    public void copiar(){
        System.out.println("Copiando Xerox");
    }
}
