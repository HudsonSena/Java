package JavaClasseEssenciais;

public class ClassesEssenciaisSystem {
    public static void main(String[] args) {
        String nome = "Hudson";
        int idade = 32;
        double peso = 78.9;
        double renda = 3234.56;

        System.out.printf("Nome: %s, Idade: %d, Peso: %.2f, Renda: R$ %,.2f", nome, idade, peso, renda);
    }
}

class ClassesEssenciaisStringBuilder {
    public static void main(String[] args) {
        /*String nome = "Hudson";
        nome = nome.concat(" Diego");
        nome = nome.concat(" sou desenvolvedor");
        */

        //O melhor solução para isso, é usar o StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Hudson");
        sb.append("Diego");
        sb.append("sou desenvolvedor");

    }
}
