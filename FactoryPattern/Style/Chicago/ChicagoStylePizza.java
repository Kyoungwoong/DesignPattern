package Style.Chicago;

import Style.Pizza;

public class ChicagoStylePizza extends Pizza {

    public ChicagoStylePizza() {
        name = "Chicago Style Pizza";
        dough = "Through Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add(Pizza.TOPPINGS.CHEESE);
        toppings.add(Pizza.TOPPINGS.SHREDDED);
    }

    @Override
    public void prepare() {
        System.out.println("시카고 스타일 준비");
    }

    @Override
    public void bake() {
        System.out.println("시카고 스타일 굽기");
    }

    @Override
    public void box() {
        System.out.println("시카고 스타일 포장");
    }

}
