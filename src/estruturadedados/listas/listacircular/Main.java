package estruturadedados.listas.listacircular;

import javax.swing.event.MenuKeyListener;

public class Main {
   public static void main(String[] args) {
        ListaCircular<Integer> myList = new ListaCircular<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);

        myList.remove(1); //remove invertido o index do final para inicio

        System.out.println(myList);
   }

    
}
