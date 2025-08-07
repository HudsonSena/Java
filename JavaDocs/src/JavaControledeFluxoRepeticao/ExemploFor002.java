package JavaControledeFluxoRepeticao;

public class ExemploFor002 {
    public static void main(String[] args) {
        String alunos[] = {"Hudson", "Diego", "Oliveira", "Sena"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }

        //for each
        /*for (String aluno : alunos){
            System.out.println(aluno);
        }*/
    }
}
