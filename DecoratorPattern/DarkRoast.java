public class DarkRoast extends Beverage {
    private double cost;

    public DarkRoast() {
        description = "다크 로스트 커피";
    }

    double cost() {
        if (getSize() == SIZE.TALL) {
            cost += 0.99;
        } else if (getSize() == SIZE.GRANDE) {
            cost += 1.49;
        } else {
            cost += 1.99;
        }

        return cost;
    }
}
