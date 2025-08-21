package JavaClasseEssenciais;

public class ClassesEssenciais {
    public static void main(String[] args) {
        System.out.print("Hudson");//Print comum
        System.out.println("Diego");//Print com pulo de linha

        try{
            System.out.println("Dividindo 1/0");
            System.out.println(1/0);
        }catch (Exception ex){
            System.err.print("Houve um erro de divisão");//System.erro retorna uma mensagem de erro com formataão na cor vermelha
        }
    }
}
