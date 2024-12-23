package day3.constructor;

public class Constructor2 {
    public static void main(String[] args) {
        System.out.println("== 사람객체 생성시작 ==");

        new 사람();
        System.out.println("== 사람객체 생성끝 ==");

        System.out.println("== 청둥오리객체 생성시작 ==");

        new 청둥오리2();
        System.out.println("== 청둥오리객체 생성끝 ==");

        System.out.println("==============================");
        /* Q1. 출력
		== 청둥오리객체 생성시작 ==
		생물이 생성되었습니다.
		동물이 생성되었습니다.
		오리가 생성되었습니다.
		청둥오리 생성되었습니다.
		== 청둥오리객체 생성끝 ==
		*/
    }
}

class 생물 {
    생물() {
        // 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.
        System.out.println("생물이 생성되었습니다.");
    }
}

class 동물 extends 생물 {
    동물() {
         super(); // 부모 클래스의 생성자를 호출합니다. 생략가능합니다.
        // ㄲ이 함수는 부모 클래스 생성자를 자동으로 호출합니다.

        System.out.println("동물이 생성되었습니다.");
    }
}

class 사람 extends 동물 {

    사람() {
        // 부모 클래스의 생성자를 호출합니다. 생략가능
        // 이 함수는 부모 클래스 생성자를 호출합니다.
        super();

        System.out.println("사람이 생성되었습니다.");
    }
}

class 오리 extends 동물 {
    오리() {
        System.out.println("오리가 생성되었습니다");
    }
}

class 청둥오리2 extends 오리{
    청둥오리2() {
        System.out.println("청둥오리가 생성되었습니다");
    }
}
