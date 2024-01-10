public class Decaf extends Beverage {

    private double cost = 0.63;

    public Decaf() {
        description = "디카페인 커피";
    }

    void getDescription() {
        System.out.println(description);
    }

    double cost() {
        return super.cost() + cost;
    }
}
