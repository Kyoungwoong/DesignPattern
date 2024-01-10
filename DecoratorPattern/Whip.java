public class Whip extends CondimentDecorator {

    public Whip(Beverage b) {
        description = "휘핑";
        this.beverage = b;
    }

    public String getDescription() {
        return beverage.getDescription() + "휘핑";
    }

    public double cost() {
        return beverage.cost() + 0.4;
    }
}
