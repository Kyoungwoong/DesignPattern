public class Decaf extends StarBiz{

    private double cost = 0.63;

    public Decaf() {
        description = "디카페인 커피";
    }

    void getDescription() {
        System.out.println(description);
    }

    double cost() {
        return cost;
    }
}
