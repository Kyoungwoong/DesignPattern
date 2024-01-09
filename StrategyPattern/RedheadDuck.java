public class RedheadDuck extends Duck implements Flyable, Quackable {

    @Override
    public void fly() {
        System.out.println("RedheadDuck 훨훨~");
    }

    @Override
    public void quack() {
        System.out.println("RedheadDuck 꽥꽥!");
    }

    @Override
    void display() {
        System.out.println("RedheadDuck!");
    }
}
