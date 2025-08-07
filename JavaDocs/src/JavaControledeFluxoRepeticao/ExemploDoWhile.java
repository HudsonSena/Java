package JavaControledeFluxoRepeticao;

import java.util.Random;

public class ExemploDoWhile {
    private static int numereTentativas = 0;
    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            System.out.println("Telefone tocando - trim trim");
        } while (tocando());
        if (numereTentativas<5)
            System.out.println("Alô!!!");
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        numereTentativas++;
        System.out.println("Atendeu? " + atendeu);
        if(numereTentativas >= 5)
            return false;
        else
            return ! atendeu;
    }
}
