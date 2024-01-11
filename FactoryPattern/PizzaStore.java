public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.create(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;
    }
}
