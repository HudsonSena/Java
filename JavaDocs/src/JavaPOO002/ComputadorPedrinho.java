
public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMenssenger msnMenssenger = new MSNMenssenger();
        msnMenssenger.enviarMensagem();
        msnMenssenger.receberMensagem();

        FacebookMessenger facebookMessenger = new FacebookMessenger();
        facebookMessenger.enviarMensagem();
        facebookMessenger.receberMensagem();

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
