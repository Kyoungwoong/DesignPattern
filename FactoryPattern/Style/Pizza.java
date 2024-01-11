package Style;

import java.util.ArrayList;

public abstract class Pizza {
    public enum TOPPINGS{
        PEPPERONI, SHRIMP, CHEESE, CRUST, GRATED, REGGIANO, SHREDDED
    }

    public String name;
    public String dough;
    public String sauce;

    public ArrayList<TOPPINGS> toppings = new ArrayList<TOPPINGS>();

    public String getName() {
        return name;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

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
