package JavaPOO001.comparacao;

public class FabricaCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Branca", "Fiat", "Argos");
        Carro carro2 = new Carro("Branca", "Fiat", "palio");
        Carro carro3 = new Carro("Branca", "Fiat", "palio");
        Carro carro4 = new Carro("Branca", "Fiat", "palio");
        Carro carro5 = new Carro("Branca", "Fiat", "palio");

        //case01
        System.out.println(carro1==carro2);//false
        //case02
        System.out.println(carro1.equals(carro2));//false
        //case03
        System.out.println();
    }
}
