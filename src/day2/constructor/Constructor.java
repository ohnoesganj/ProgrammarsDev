package day2.constructor;

public class Constructor {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.age = 24;
//        p1.name = "장선호";
//        p1.home = "양주";
//        p1.showInfo();
//
//        Person p2 = new Person();
//        p2.age = 25;
//        p2.name = "이우현";
//        p2.home = "영종";
//        p2.showInfo();

        Person p1 = new Person(20, "장선호", "양주");
        p1.showInfo();

        Person p2 = new Person();

        Person p3 = new Person(25, "부산");
    }
}


class Person {
    int age;
    String name;
    String home;

    public void showInfo() {
        System.out.println("이름: " + name + ", 나이: " + age + ", 사는 곳: " + home);
    }


    // 메서드 오버로딩 -> 매개변수 개수 혹은 타입이 달라야 함
    public Person() {}

    public Person(int age, String name, String home) {
        this.age = age;
        this.name = name;
        this.home = home;
    }

    public Person(int age, String home) {
        this.age = age;
        this.home = home;
    }

    public void setData(int age, String name, String home) {
        this.age = age;
        this.name = name;
        this.home = home;
    }
}

