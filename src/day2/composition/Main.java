package day2.composition;

public class Main {
    public static void main(String[] args) {
        홍길동 dong = new 홍길동();
        홍길순 soon = new 홍길순();

        dong.자바개발();

        soon.자바개발();
        soon.파이썬개발();

        이순신주식회사 leeCorp = new 이순신주식회사();
        leeCorp.자바개발(); // 자바23 개발을 합니다.
        leeCorp.파이썬개발(); // 파이썬 개발을 합니다.

    }
}

class 홍길동 {
    public void 자바개발() {
        System.out.println("자바23 개발을 합니다.");
    }
}

class 홍길순 {
    홍길동 dong = new 홍길동();

    public void 자바개발() {
        dong.자바개발();
    }

    public void 파이썬개발() {
        System.out.println("파이썬 개발을 합니다.");
    }
}

class 이순신주식회사 {
    홍길순 soon = new 홍길순();

    public void 자바개발() {
        soon.자바개발();
    }

    public void 파이썬개발() {
        soon.파이썬개발();
    }
}

