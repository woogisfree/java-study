package basics.poly.ex.sender;

public class SendMain {

    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("Welcome!");
        }
    }
}
