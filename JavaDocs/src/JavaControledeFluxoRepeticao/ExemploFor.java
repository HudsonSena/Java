package JavaControledeFluxoRepeticao;

public class ExemploFor {
    public static void main(String[] args) {
        for(int carneirinhos = 1 ; carneirinhos <= 20 ; carneirinhos ++){
            String resultado = carneirinhos == 1 ? carneirinhos + " - Carneirinho":carneirinhos + " - Carneirinhos";
            System.out.println(resultado);
        }
    }
}