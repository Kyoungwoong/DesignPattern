public class main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();
        Duck rubberDuck = new RubberDuck();

        System.out.println("============================================================");
        // MallardDuck
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.swim();
        mallardDuck.performFly();
        System.out.println("============================================================\n");

        // ReadHeadDuck
        redheadDuck.display();
        redheadDuck.performQuack();
        redheadDuck.swim();
        redheadDuck.performFly();
        redheadDuck.setFlyBehavior(new FlyRocketPowered());
        redheadDuck.performFly();
        System.out.println("============================================================\n");

        // RubberDuck
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.swim();
        rubberDuck.performFly();
        System.out.println("============================================================\n");
    }
}
