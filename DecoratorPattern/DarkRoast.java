public class DarkRoast extends Beverage {
    private double cost = 0.99;

    public DarkRoast() {
        description = "다크 로스트 커피";
    }

    void getDescription() {
        System.out.println(description);
    }

    double cost() {
        return super.cost() + cost;
    }
}
