package referenciaecopia.nosencadeiamento;

public class RodaNo {
    public static void main(String[] args) {
        //encadeiamento de nós
        // como abordar estrutura de dados dinamicas
        No no1 = new No("no1");
        System.out.println(no1);

        No no2 = new No("no2");
        System.out.println(no2);

        No no3 = new No("no3");

        No no4 = new No("no4");

        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no2);
    }
}
