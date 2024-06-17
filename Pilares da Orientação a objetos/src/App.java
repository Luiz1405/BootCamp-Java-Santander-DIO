
public class App {
    public static void main(String[] args) throws Exception {
        FacebookMessenger fcb = new FacebookMessenger();

        fcb.enviarMensagem();
        fcb.receberMensagam();

        MSNMessenger msn = new MSNMessenger();

        msn.enviarMensagem();
        msn.receberMensagam();

        Telegram telegram = new Telegram();

        telegram.enviarMensagem();
        telegram.receberMensagam();
    }
}
