package JavaControledeFluxoRepeticao;

import java.util.Random;

public class ExemploFor003 {
    public static void main(String[] args) {
        boolean dormiu = false;
        for(int carneirinhos = 1; carneirinhos<=20; carneirinhos++){
            System.out.println(carneirinhos + " Carneirinhos");
            if(dormiu = new Random().nextInt(20) == carneirinhos){
                System.out.println("Dormiu...");
                break;
            }
        }
    }
}
