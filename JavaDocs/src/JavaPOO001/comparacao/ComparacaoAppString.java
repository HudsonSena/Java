package JavaPOO001.comparacao;

public class ComparacaoAppString {
    public static void main(String[] args) {
        String string = "Hudson";

        // == - para referencias e tipos primitivos
        String string01 = "Hudson";
        System.out.println(string == string01);//true

        //Comparacao de maiuscula com minusculas sem equals
        String string02 = "HUDSON";
        System.out.println(string == string02);//false

        //Comparacao de string com novos string/objetos
        String string03 = new String("Hudson");
        System.out.println(string == string03);//false
        //equals compara caracteristica de referencias dos objetos
        System.out.println(string.equals(string03));//true

        //Para comparacao de maiusculas e minusculas com equal e equalIgnoreCase
        String string04 = new String("HUDSON");
        System.out.println(string.equals(string04));//false
        System.out.println(string.equalsIgnoreCase(string04));//true
    }
}
