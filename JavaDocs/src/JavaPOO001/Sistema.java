package JavaPOO001;

public class Sistema {
    public static void main(String[] args) {
        Cliente diego = new Cliente("Diego02");
        //Caso não tenha contrutor na função Cliente
        //diego.nome = "Diego";
        System.out.println(diego.limiteCredito);
        diego.solicitarLimiteCredito(350.00);
        System.out.println("Limite de " + diego.nome + " Antes da compra: " + diego.limiteCredito);
        diego.comprar(30.00);
        System.out.println("Limite de " + diego.nome + " Depois da compra: " + diego.limiteCredito);

        Cliente hudson = new Cliente("Hudson02");
        //Caso não tenha contrutor na função Cliente
        //hudson.nome = "Hudson";
        System.out.println(hudson.limiteCredito);
        hudson.solicitarLimiteCredito(250.00);
        System.out.println("Limite de " + hudson.nome + " é "+ hudson.limiteCredito);
    }
}
