package JavaBeans;

public class Aluno {
    private String nome;
    private int idade = 0;

    public String getNome() {
        return nome;
    }
    public void setNome(String newNome) {
        nome = newNome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int newIdade) {
        if(newIdade < 0 || newIdade > 150) {
            throw new IllegalArgumentException("O valor da idade deve está entre 0 e 150 anos");
        }
        this.idade = newIdade;
    }
}
