package basics.oop1.ex;

public class RectangleProcedurealMain {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;

        int area = calculateArea(width, height);
        System.out.println("area = " + area);

        int perimeter = calculatePerimeter(width, height);
        System.out.println("perimeter = " + perimeter);

        boolean sqaure = isSqaure(width, height);
        System.out.println("sqaure = " + sqaure);
    }

    static int calculateArea(int width, int height) {
        return width * height;
    }

    static int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }

    static boolean isSqaure(int width, int height) {
        return width == height;
    }
}
