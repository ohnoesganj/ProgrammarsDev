package day2.constructor;

public class Constructor {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "장선호";
        p1.home = "서울";
        p1.showInfo();

        Person p2 = new Person();
        p2.age = 25;
        p2.name = "이우현";
        p2.home = "영종";
        p2.showInfo();
    }
}


class Person {
    int age;
    String name;
    String home;

    public void showInfo() {
        System.out.println("이름: " + name + ", 나이: " + age + ", 사는 곳: " + home);
    }
}

