package JavaBeans;

public class Objetos {
    public static void main(String[] args){
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe Jr");
        felipe.setIdade(15);
        System.out.println(felipe.getNome());
        System.out.println(felipe.getIdade() + " anos de idade");

    }
}
