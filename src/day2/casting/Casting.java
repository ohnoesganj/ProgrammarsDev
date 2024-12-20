package day2.casting;

public class Casting {
    public static void main(String[] args) {
        칼 sword = new 칼();
        활 bow = new 활();

        무기 weapon = new 칼();
        weapon.사용();  // 출력: 칼을 휘두르다

        weapon = new 활();
        weapon.사용();  // 출력: 화살을 날린다

        // 칼 sword2 = (칼)weapon; // 상위 타입이 하위타입으로 형변환 X. 하지만 강제로 수동 형변환 가능.
        // sword2.칼을_휘두르다();


    }
}

class Warrior {
//    칼 sword = new 칼();
//    활 bow = new 활();

    무기 weapon = new 칼();
}

abstract class 무기 {
    public abstract void 사용();
}

class 칼 extends 무기 {
    public void 사용() {
        System.out.println("칼을 휘두르다.");
    }
}

class 활 extends 무기 {
    public void 사용() {
        System.out.println("화살을 날린다.");
    }
}

class 도끼 extends 무기 {
    @Override
    public void 사용() {
        System.out.println("도끼를 휘두르다.");
    }
}