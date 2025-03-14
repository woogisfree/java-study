package basics.poly.ex.pay0;

public class KakaoPay implements Pay {

    @Override
    public boolean pay(int amount) {
        System.out.println("Connect to Kakao Pay System");
        System.out.println("Amount to pay: " + amount);
        return true;
    }
}
