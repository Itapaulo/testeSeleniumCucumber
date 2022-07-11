package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	static protected WebDriver driver;

	public void abrirNavegador(String navegador, String site) {
		/**
		 * Metodo para abrir o navegador
		 * 
		 * @param navegador
		 * @param site
		 */

		try {
			if (navegador.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();

			}
			driver.get(site);
			driver.manage().window().maximize();
			// driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.err.println("-------- erro ao abrir navegedor -------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());
		}
	}

	public void fecharNavegador() {

		/**
		 * Metodo para fechar o navegador
		 */
		try {
			driver.quit();
		} catch (Exception e) {
			System.err.println("-------- erro ao fechar navegedor -------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());
		}

	}

}
