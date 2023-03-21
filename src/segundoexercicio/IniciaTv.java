package segundoexercicio;

public class IniciaTv {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv(true,5,35);
        int[] numer;
        numer = new int[2]; // definir tamanho de array
        numer[0] = 1;
        numer[1] = 2;
        System.out.println(numer[1]);

        int[] list2 = {10,20,30,40,50};
        System.out.println(list2[1]);


        for (int x=0; x<10; x++){
            smartTv.aumentarVolume();
        } //for funciona igual js
        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);
    }
}
