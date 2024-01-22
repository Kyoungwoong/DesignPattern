package SimpleAdapter;

public class DuckTestDrive {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();

		Turkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);

		System.out.println("The SimpleAdapter.Turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println("\nThe SimpleAdapter.Duck says...");
		testDuck(duck);

		System.out.println("\nThe SimpleAdapter.TurkeyAdapter says...");
		testDuck(turkeyAdapter);
		
//		// Challenge
//		Drone drone = new SuperDrone();
//		SimpleAdapter.Duck droneAdapter = new DroneAdapter(drone);
//		testDuck(droneAdapter);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
