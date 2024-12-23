package day3.arrayList;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {
        // 배열의 단점 -> 길이 고정
        int[] arr = new int[3];
//        System.out.println(arr.length);

        // 단점 해결 -> ArrayList
        // <> 안 -> 무조건 객체 타입 (참조 타입)

        // Wrapper 클래스
        // int -> Integer
        // char -> Character

        // double -> Double
        // long -> Long


        // 1. 네 사람을 ArrayList에 저장
        // 2. 네 사람에게 자기소개 시키기 (자기소개 문구 : 안녕하세요 ~~살 ~~~입니다.)
        // 3. 30대인 사람에게만 자기소개 시키기

        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "홍길동";

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";

        Person p3 = new Person();
        p3.age = 41;
        p3.name = "을지문덕";

        Person p4 = new Person();
        p4.age = 32;
        p4.name = "황진이";

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).age >= 30 && list.get(i).age < 40) {   // Q3
                list.get(i).introduce();
            }
        }
    }
}

class Person {
    int age;
    String name;

    public void introduce() {
        System.out.println("안녕하세요 " + age + "살 " + name + "입니다.");  // Q2
    }
}
