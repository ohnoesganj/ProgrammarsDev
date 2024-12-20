package day2;

public class Instance {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.age = 24;
        p1.name = "장선호";
        p1.home = "양주";
        p1.height = 167.2;

        introduce(p1);
    }

    public static void introduce(Person p1) {
        System.out.println("나이: " + p1.age + " 이름: " + p1.name + " 사는 곳: " + p1.home + " 키: " + p1.height);
    }
}

class Person {
    int age;
    String name;
    String home;
    double height;
}
