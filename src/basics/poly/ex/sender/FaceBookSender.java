package basics.poly.ex.sender;

public class FaceBookSender implements Sender {

    @Override
    public void sendMessage(String message) {
        System.out.println("FaceBook sent: " + message);
    }
}
