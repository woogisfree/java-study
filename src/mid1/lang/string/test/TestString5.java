package mid1.lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "Hello.txt";
        String ext = ".txt";

        String filename = str.substring(0, str.indexOf("."));
        String extName = str.substring(str.lastIndexOf("."));
        System.out.println(filename);
        System.out.println(extName);
    }
}
