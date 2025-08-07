package JavaControledeFluxo.condicional;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 30.0;

        if(valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
        System.out.println("Saldo: " + saldo);
        System.out.println("Valor solicitado: " + valorSolicitado);

    }
}
