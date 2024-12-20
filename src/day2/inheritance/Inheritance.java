package day2.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Dog1 d1 = new Dog1();
        d1.bark();
        d1.eat();

        Cat cat = new Cat();
        cat.meow();
        cat.eat();


        // q1.
        // 사람 만들기
        // 출력 : 먹는다
        Human h = new Human();
        h.eat();
        //========================================


        // q2.
        // 고양이 2개 만들기

        // 출력 : 야옹
        // 출력 : 담을 뛰어넘는 능력이 있습니다.
        WhiteCat cat2 = new WhiteCat();
        cat2.meow();
        cat2.jump();

        // 출력 : 야옹
        // 출력 : 미래를 예측하는 능력이 있습니다.
        BlackCat cat3 = new BlackCat();
        cat3.meow();
        cat3.future();
    }
}


class Animal {
    public void eat() {
        System.out.println("먹는다");
    }
}

class Human extends Animal {
}

class Dog1 extends Animal {
    public void bark() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("야옹");
    }
}

class BlackCat extends Cat{
    public void future() {
        System.out.println("미레를 예측하는 능력이 있습니다.");
    }
}

class WhiteCat extends Cat{
    public void jump() {
        System.out.println("담을 뛰어넘는 능력이 있습니다.");
    }
}
