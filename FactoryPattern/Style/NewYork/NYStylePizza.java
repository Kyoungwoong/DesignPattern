package Style.NewYork;

import Style.Pizza;

public class NYStylePizza extends Pizza {

    public NYStylePizza() {
        name = "NY Style Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add(Pizza.TOPPINGS.CHEESE);
        toppings.add(Pizza.TOPPINGS.GRATED);
        toppings.add(Pizza.TOPPINGS.REGGIANO);
    }

    @Override
    public void prepare() {
        System.out.println("뉴욕 스타일 준비");
    }

    @Override
    public void bake() {
        System.out.println("뉴욕 스타일 굽기");
    }

    @Override
    public void box() {
        System.out.println("뉴욕 스타일 포장");
    }

}
