package basics.poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
        //poly.childMethod();

        Child child = (Child) poly;
        child.childMethod();
    }
}
