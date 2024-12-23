package day3.duckSimul;

public class Main {
    public static void main(String[] args) {

        로봇오리 a로봇오리 = new 로봇오리();
        a로봇오리.날다();
        // 출력 : 저는 못 날아요 ㅠㅠ
        a로봇오리.수영하다();
        // 출력 : 물갈퀴로 수영합니다.

        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        // 출력 : 저는 못 날아요 ㅠㅠ
        a고무오리.수영하다();
        // 출력 : 물에 둥둥 뜹니다.
    }
}

class 오리 {

    날개 wing = new 일반날개();
    발 foot = new 일반발();

    public void 날다() {
        wing.날다();
    }

    public void 수영하다() {
        foot.수영하다();
    }
}


class 고무오리 extends 오리 {
    고무오리() {
        wing = new 고무날개();
        foot = new 고무발();
    }
}

// 정답은 -> 불가능하다
class 로봇오리 extends 고무오리 {
    로봇오리() {
        wing = new 고무날개();
        foot = new 일반발();
    }
}

abstract class 날개 {
    public abstract void 날다();
}

class 일반날개 extends 날개 {
    public void 날다() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class 고무날개 extends 날개 {
    public void 날다() {
        System.out.println("저는 못 날아요ㅠㅠ");
    }
}

abstract class 발 {
    public abstract void 수영하다();
}

class 일반발 extends 발{
    public void 수영하다() {
        System.out.println("물갈퀴로 수영합니다.");
    }
}

class 고무발 extends 발{
    public void 수영하다() {
        System.out.println("둥둥 떠다닙니다.");
    }
}
