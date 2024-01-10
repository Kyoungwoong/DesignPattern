public class Espresso extends StarBiz{

    private double cost = 0.27;

    public Espresso() {
        description = "에스프레소 커피";
    }

    void getDescription() {
        System.out.println(description);
    }

    double cost() {
        return cost;
    }
}
