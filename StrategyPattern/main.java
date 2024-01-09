public class main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();
        Duck rubberDuck = new RubberDuck();

        // MallardDuck
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.fly();
        mallardDuck.display();

        // ReadHeadDuck
        redheadDuck.quack();
        redheadDuck.swim();
        redheadDuck.fly();
        redheadDuck.display();

        // RubberDuck
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.fly();
        rubberDuck.display();

    }
}
