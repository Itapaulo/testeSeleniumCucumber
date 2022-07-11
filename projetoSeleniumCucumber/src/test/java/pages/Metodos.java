package pages;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos extends Browser {

	public void clicar(By elemento) {
		/**
		 * Metodo para clicar
		 * 
		 * @author Itamar Paulo
		 * @param elemento
		 */
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.err.println("-------- erro ao ao clicar -------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());
		}
	}

	public void escrever(By elemento, String texto) {

		/**
		 * Metodo para escrever
		 * 
		 * @param elemento
		 * @param texto
		 * @author Itamar Paulo
		 */
		try {

			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.err.println("-------- erro ao escrever -------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());
		}
	}

	public void scrolUp() {
		/**
		 * Metodo para dar page up a fim de visualizar o que estiver no topo dela
		 * 
		 * @author Itamar Paulo
		 */
		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
		} catch (Exception e) {

			System.err.println("-------- erro ao dar scrol Up -------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());
		}

	}

	public void validarTexto() {
		/**
		 * Metodo para validar o texto que aparece ao concluir o envio da cotação
		 * 
		 * @author Itamar Paulo
		 */
		try {

			String textoElement = driver.findElement(By.xpath("/html/body/div[4]/h2")).getText();
			assertEquals("Sending e-mail success!", textoElement);
			System.out.println("Texto validado com sucesso");
		} catch (Exception e) {

			System.err.println("-------- erro ao validar texto -------- " + e.getMessage());
			System.err.println("-------- causa do erro -------- " + e.getCause());

		}
	}

	public void screenShot(String nomeEvidencia) {
		/**
		 * Metodo para tirar evidencia apenas sucesso no envio da cotação Para
		 * visualizar o print da tela, atualizar o projeto (refresh) e abrir a pasta
		 * evidencia
		 * 
		 * @author Itamar Paulo
		 */
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
			FileUtils.copyFile(scrFile, destFile);

		} catch (Exception e) {
			System.err.println("----------Erro ao tirar evidencia-----------" + e.getMessage());
			System.err.println("----------Causa do erro-------------" + e.getCause());
		}
	}

	public void esperar() {
		try {

			TimeUnit.SECONDS.sleep(2);
		} catch (Exception e) {

			System.err.println("----------Erro ao esperar-----------" + e.getMessage());
			System.err.println("----------Causa do erro-------------" + e.getCause());
		}

	}

	public void esperarElementoClicavel(By elemento, int tempo) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, tempo);
			wait.until(ExpectedConditions.elementToBeClickable(elemento));

		} catch (Exception e) {
			System.err.println("----------Erro ao esperar o elemento ser clicavel -----------" + e.getMessage());
			System.err.println("----------Causa do erro-------------" + e.getCause());
		}
	}
}
