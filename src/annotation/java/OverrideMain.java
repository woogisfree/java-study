package annotation.java;

public class OverrideMain {

    static class A {
        public void call() {
            System.out.println("A.call");
        }
    }

    static class B extends A {

        //        @Override
        public void calllll() {
            System.out.println("B.calllll");
        }
    }
}
