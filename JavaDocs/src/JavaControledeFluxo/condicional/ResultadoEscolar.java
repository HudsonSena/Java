package JavaControledeFluxo.condicional;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 4;

        if(nota >= 7)
            System.out.println("Aprovado");
        else if(nota >= 5 && nota <7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado!");

        //Condição Ternária
        /* String resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "Recuperação" : "Reprovado";
        System.out.println(resultado); */

    }
}
