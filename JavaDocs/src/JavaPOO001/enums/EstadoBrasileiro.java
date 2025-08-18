package JavaPOO001.enums;

public enum EstadoBrasileiro {
    PIAUI("Piaui", "PI"),
    MARANHAO("Marahao", "MA"),
    SAO_PAULO("Sao Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
    CEARA("Ceara", "CE")
    ;
     private String nome;
     private String sigla;
     private EstadoBrasileiro(String nome, String sigla){
         this.nome = nome;
         this.sigla = sigla;
     }

     public String getNome(){
         return nome;
     }

     public String getSigla() {
        return sigla;
     }
}
