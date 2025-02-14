package basics.final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        final int data1;
        data1 = 10;
        // data1 = 20; Variable 'data1' might already have been assigned to

        final int data2 = 10;
        // data2 = 20; Cannot assign a value to final variable 'data2'

        method(10);
    }

    static void method(final int parameter) {
        // parameter = 20; Cannot assign a value to final variable 'parameter'
    }
}
