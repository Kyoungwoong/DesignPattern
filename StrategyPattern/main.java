public class main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();
        Duck rubberDuck = new RubberDuck();

        // MallardDuck
        mallardDuck.performQuack();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.display();

        // ReadHeadDuck
        redheadDuck.performQuack();
        redheadDuck.swim();
        redheadDuck.performFly();
        redheadDuck.display();

        // RubberDuck
        rubberDuck.performQuack();
        rubberDuck.swim();
        rubberDuck.display();
        rubberDuck.performFly();
    }
}
