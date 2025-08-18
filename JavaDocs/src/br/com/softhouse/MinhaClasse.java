package br.com.softhouse;

//import java.math.BigDecimal;
//import br.com.softhouse.model.User;

public class MinhaClasse {
    public static void main(String[] args) {
        /*String nome = "Hudson";
        Integer idade = 10;
        BigDecimal altura = BigDecimal.ONE;
        System.out.println(altura);*/

        User user = new User();
        user.showMyName();

        br.com.softhouse.m2.User userM2 = new br.com.softhouse.m2.User();
        userM2.showMyName();
    }
}
