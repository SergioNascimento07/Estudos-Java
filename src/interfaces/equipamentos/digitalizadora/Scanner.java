package interfaces.equipamentos.digitalizadora;

import java.io.InputStream;

public class Scanner implements Digitalizadora{
    public Scanner(InputStream in) {
    }

    public void digitalizar(){
        System.out.println("Digitalizando Scanner");
    }
}
