package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Date dateA = new Date();
        dateA.value = 10;
        Date dateB = dateA;
        System.out.println("dataA 참조값=" + dateA);
        System.out.println("dataB 참조값=" + dateB);
        System.out.println("dataA.value=" + dateA.value);
        System.out.println("dataB.value=" + dateB.value);

        dateA.value = 20;
        System.out.println("변경 dataA.value=20");
        System.out.println("dataA.value=" + dateA.value);
        System.out.println("dataB.value=" + dateB.value);

        dateB.value = 30;
        System.out.println("변경 dataB.value=30");
        System.out.println("dataA.value=" + dateA.value);
        System.out.println("dataB.value=" + dateB.value);
    }
}
