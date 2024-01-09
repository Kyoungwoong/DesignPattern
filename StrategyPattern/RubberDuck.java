public class RubberDuck extends Duck implements Quackable {
    @Override
    public void quack() {
        System.out.println("삑!");
    }

    @Override
    void display() {
        System.out.println("RubberDuck!");
    }
}
