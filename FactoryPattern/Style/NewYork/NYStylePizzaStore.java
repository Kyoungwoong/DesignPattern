package Style.NewYork;

import Style.Pizza;
import Style.PizzaStore;

public class NYStylePizzaStore extends PizzaStore {

    public Pizza create(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("vege")) {
            pizza = new NYStyleVegetablePizza();
        } else if (type.equals("shrimp")) {
            pizza = new NYStyleShrimpPizza();
        }

        return pizza;
    }
}
