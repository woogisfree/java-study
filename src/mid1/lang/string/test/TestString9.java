package mid1.lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] split = email.split("@");
        String idPart = split[0];
        String domainPart = split[1];

        System.out.println("ID: " + idPart);
        System.out.println("Domain: " + domainPart);
    }
}
