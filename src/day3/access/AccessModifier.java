package day3.access;

public class AccessModifier {
    public static void main(String[] args) {

        Test t1 = new Test();
        t1.print();

        t1.setData(20);
        t1.print();

        t1.setData(0);
        t1.print();


        // 문제 : 사람의 id를 출력해주세요.
        // 조건 : 사람의 id를 20으로 설정해주세요.
        // 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
        // 조건 : 사람 클래스에서 출력할 수 없습니다.

        // 구현시작
        Person p1 = new Person();
        p1.setData(20);

        System.out.println("제 번호는 " + p1.getData() + " 입니다.");

        // 구현끝

        // 출력 : 제 번호는 20 입니다.
    }
}

class Test {
    private int data = 10;

    public void setData(int data) {
        this.data = data;
    }

    public void print() {
        System.out.println(data / 10);
    }
}

class Person {
    private int id;

    public void setData(int id) {
        this.id = id;
    }

    public int getData() {
        return id;
    }
}
