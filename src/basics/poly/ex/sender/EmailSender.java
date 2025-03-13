package basics.poly.ex.sender;

public class EmailSender implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}
