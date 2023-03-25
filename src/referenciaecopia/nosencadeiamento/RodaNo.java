package referenciaecopia.nosencadeiamento;

public class RodaNo {
    public static void main(String[] args) {
        //encadeiamento de nós
        // como abordar estrutura de dados dinamicas
        No<String> no1 = new No("no1");
        System.out.println(no1);

        No<Integer> no2 = new No(2);
        System.out.println(no2);

        No<String> no3 = new No("no3");

        No<String> no4 = new No("no4");

        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no2);
    }
}
