package Style.Chicago;

import Style.Pizza;
import Style.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza create(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("vege")) {
            pizza = new ChicagoStyleVegetablePizza();
        } else if (type.equals("shrimp")) {
            pizza = new ChicagoStyleShrimpPizza();
        }

        return pizza;
    }
}

