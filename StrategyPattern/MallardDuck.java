public class MallardDuck extends Duck implements Flyable, Quackable{

    @Override
    public void fly() {
        System.out.println("MallardDuck 훨훨~");
    }

    @Override
    public void quack() {
        System.out.println("MallardDuck 꽥꽥!");
    }

    @Override
    void display() {

        System.out.println("MallardDuck!");
    }
}
