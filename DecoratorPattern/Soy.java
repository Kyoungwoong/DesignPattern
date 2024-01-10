public class Soy extends CondimentDecorator {

    public Soy(Beverage b) {
        description = "두유";
        this.beverage = b;
    }

    public String getDescription() {
        return beverage.getDescription() + "두유";
    }

    public double cost() {
        return beverage.cost() + 0.3;
    }
}
