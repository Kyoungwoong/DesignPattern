public class Espresso extends Beverage {

    private double cost = 0.27;

    public Espresso() {
        description = "에스프레소 커피";
    }

    void getDescription() {
        System.out.println(description);
    }

    double cost() {
        return super.cost() + cost;
    }
}
