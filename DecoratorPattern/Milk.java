public class Milk extends CondimentDecorator {

    public Milk(Beverage b) {
        description = "우유";
        this.beverage = b;
    }

    public String getDescription() {
        return beverage.getDescription() + "우유";
    }

    public double cost() {
        return beverage.cost() + 0.1;
    }
}
