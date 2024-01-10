public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println("espresso: " + espresso.getDescription() + " cost: " + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println("Dark double Mocha whipping: " + darkRoast.getDescription() + " cost: " + darkRoast.cost());

        Beverage sameB = new Whip(new Mocha(new Mocha(new DarkRoast())));
        System.out.println("Dark double Mocha whipping: " + sameB.getDescription() + " cost: " + sameB.cost() + "\t" + sameB.getClass());

        // SIZE = GRANDE;
        Beverage darkRoastGrande = new DarkRoast();
        darkRoastGrande.setSize(Beverage.SIZE.GRANDE);
        darkRoastGrande = new Mocha(darkRoastGrande);
        darkRoastGrande = new Mocha(darkRoastGrande);
        darkRoastGrande = new Whip(darkRoastGrande);
        System.out.println("Dark Grande double Mocha whipping: " + darkRoastGrande.getDescription() + " cost: " + darkRoastGrande.cost());
    }
}
