package JavaControledeFluxoRepeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile002 {
    public static void main(String[] args) {
        double mesada = 50.0;
        double total = 0.0;
        while(mesada > 0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: "+ valorDoce + " Adicionar no carrinho");
            mesada = mesada - valorDoce;
            total = total + valorDoce;
        }
        System.out.println("Total: " + total);
        System.out.println("Mesada: " + mesada);
        System.out.println("Anya gastou  toda a sua mesada em doces");

    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
