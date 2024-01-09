public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    // 모든 오리의 동작을 여기서 정의

    void performQuack() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBehavior.fly();
    }

    void swim() {
        System.out.println("헤엄!");

    }

    // 오리에 따른 description
    abstract void display();
}
