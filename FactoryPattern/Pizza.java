import java.util.ArrayList;

public abstract class Pizza {
    enum TOPPINGS{
        PEPPERONI, SHRIMP, CHEESE, CRUST, GRATED, REGGIANO, SHREDDED
    }

    String name;
    String dough;
    String sauce;
    ArrayList<TOPPINGS> toppings = new ArrayList<TOPPINGS>();

    public void prepare() {
        System.out.println("준비");
    }

    public void bake() {
        System.out.println("굽기");
    }

    public void box() {
        System.out.println("포장");
    }
}
