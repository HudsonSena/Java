package JavaPOO001.enums;

import java.util.Locale;

public class SistemaNumeracao {
    public static void main(String[] args) {
        String nomeString = "sao_paulo";
        EstadoBrasileiro eb = EstadoBrasileiro.valueOf(nomeString.toUpperCase());
        System.out.println(eb.name());
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());

        for (EstadoBrasileiro ab: EstadoBrasileiro.values()){
            System.out.println("Estado Localizado: ");
            System.out.println(eb.name());
            System.out.println(eb.getNome());
            System.out.println(eb.getSigla());
        }
    }
}
