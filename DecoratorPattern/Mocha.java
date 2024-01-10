public class Mocha extends CondimentDecorator {

    public Mocha(Beverage b) {
        this.beverage = b;
    }

    public String getDescription() {
        return beverage.getDescription() + "모카";
    }

    public double cost() {
        return beverage.cost() + 0.2;
    }
}
