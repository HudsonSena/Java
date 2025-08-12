package JAvaExcecoesP01;

import java.util.Locale;
import java.util.Scanner;

public class Excecao001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        //Caso não digite nada

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        //Caso não digite nad

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        //Valor da idade não numérico
        //java.util.InputMismatchException

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        //Valor possuir virgula, ao invés de ponto
        //java.util.InputMismatchException

        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " metros");
        scanner.close();
    }
}
