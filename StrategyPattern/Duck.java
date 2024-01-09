public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    // 모든 오리의 동작을 여기서 정의

    void performQuack() {
        quackBehavior.quack();
    }

    void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void performFly() {
        flyBehavior.fly();
    }

    void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    void swim() {
        System.out.println("헤엄!");

    }

    // 오리에 따른 description
    abstract void display();
}
