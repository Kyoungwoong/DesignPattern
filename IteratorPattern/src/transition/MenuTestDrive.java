package transition;
import java.util.ArrayList;

public class MenuTestDrive {
	public static void main(String args[]) {
		ArrayList<Menu> menus = new ArrayList<Menu>();

		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		menus.add(pancakeHouseMenu);
		menus.add(dinerMenu);

		Waitress waitress = new Waitress(menus);

		waitress.printMenu();

	}
}
