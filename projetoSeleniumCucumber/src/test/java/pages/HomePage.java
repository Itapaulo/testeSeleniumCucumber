package pages;

import org.openqa.selenium.By;

public class HomePage {
	
	
		Metodos metodos = new Metodos();
		
		By menuMobile = By.id("nav_automobile");
		By menuTruck = By.id("nav_truck");
		By menuMotorcycle = By.id("nav_motorcycle");
		By menuCamper = By.id("nav_camper");
		
		
		public void escolherMenu(String menu) {
			
			if(menu.equalsIgnoreCase("automobile")){
				metodos.clicar(menuMobile);
				
			}else if(menu.equalsIgnoreCase("truck")){
				metodos.clicar(menuTruck);
			} else if(menu.equalsIgnoreCase("motorcycle")) {
				metodos.clicar(menuMotorcycle);
			} else if(menu.equalsIgnoreCase("camper")){
				metodos.clicar(menuCamper);
			} 
		}
		

}
