package basics.construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    /**
     * this() 는 생성자 코드의 첫 줄에만 사용할 수 있다.
     */
    public MemberConstruct(String name, int age) {
        this(name, age, 20);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
