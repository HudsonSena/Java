package JavaClasseEssenciais;

import java.util.Scanner;

public class ClassesEssenciaisScanner02 {
    public static void main(String[] args) {
        String nome = null;
        Integer idade = null;
        Double peso = null;

        //simulando uma linda existente em um arquivo txt
        String stringLinhaArquivo = "hudson diego;32;78.90";
        Scanner scan = new Scanner(stringLinhaArquivo);
        scan.useDelimiter(";"); //definindo um delimitador
        //conhecendo novos recursos
        int index = 0;
        while (scan.hasNext()){
            if(index == 0)
                nome = scan.next();
            else if(index == 1)
                idade = Integer.valueOf(scan.next());
            else
                peso = Double.valueOf(scan.next());
            index ++;//mais um conceito escondido aqui
        }

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu peso é: " + peso);
    }
}
