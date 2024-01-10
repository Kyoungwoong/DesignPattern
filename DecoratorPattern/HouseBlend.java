public class HouseBlend extends StarBiz{

    private double cost = 0.45;

    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }

    void getDescription() {
        System.out.println(description);
    }

    double cost() {
        return cost;
    }
}
