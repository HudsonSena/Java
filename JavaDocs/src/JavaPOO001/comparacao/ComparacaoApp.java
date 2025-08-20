package JavaPOO001.comparacao;

public class ComparacaoApp {
    public static void main(String[] args) {
        //stack vs heap
        //stack - 127bits
        //heap - objects 128bits+
        Integer i1 = 128;//heap object
        Integer i2 = Integer.parseInt("128");//heap object
        System.out.println(i1 == i2);//false
        System.out.println(i1.equals(i2));//True. two objects

        Integer a1 = 13;//stack
        Integer a2 = Integer.parseInt("13");//stack
        System.out.println(a1 == a2);//true

    }
}
