package interfaces.estabelecimento;

import interfaces.equipamentos.copiadora.Copiadora;
import interfaces.equipamentos.impressora.Deskjet;
import interfaces.equipamentos.impressora.Impressora;
import interfaces.equipamentos.impressora.LaserJet;
import interfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        //Impressora é a interface
        // Deskjet é a classe que implementa a impressora
        Impressora impressora = new LaserJet();
        // LaserJet impressora = new LaserJet(); da no mesmo
        //Dá pra instanciar com nome LaserJet ou Impressora antes da variavel
        //mesmo resultado
        impressora.imprimir();

        //Na hora de instanciar é necesário escolher que interface seguir

        Copiadora emf = new EquipamentoMultifuncional();
        // emf.imprimir(); -- Não é possivel pois foi instanciado com
        emf.copiar();
        Impressora emf2 = new EquipamentoMultifuncional();
        emf2.imprimir();
        //quando instanciado com Interface definida antes da variavel permite somento aquele metodo
        EquipamentoMultifuncional neweq = new EquipamentoMultifuncional();
        neweq.imprimir();
        neweq.copiar();
        neweq.digitalizar();

        Deskjet desk = new Deskjet();
        desk.imprimir();
}
}