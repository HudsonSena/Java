public class ComputadorPedrinho02 {
    public static void main(String[] args) {
        SistemaMensagemInstantanea smi = null;

        String appEsolhido="tlg";

        if(appEsolhido.equals("msn")) {
            smi = new MSNMenssenger();
        }
        else if(appEsolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        }
        else if(appEsolhido.equals("tlg")) {
            smi = new Telegram();
        }
        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
