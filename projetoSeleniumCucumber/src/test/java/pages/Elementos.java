package pages;

import org.openqa.selenium.By;

public class Elementos {

	// Elementos da aba Enter Vehicle Data

	By elementomake = By.id("make");
	By enginePerformance = By.id("engineperformance");
	By dateManufacture = By.id("dateofmanufacture");
	By numberSeats = By.id("numberofseats");
	By fuelType = By.id("fuel");
	By listPrice = By.id("listprice");
	By licenseNumber = By.id("licenseplatenumber");
	By annualMileage = By.id("annualmileage");
	By nextInsuranceData = By.id("nextenterinsurantdata");

	// Elementos da aba Enter Insurant Data

	By firstName = By.id("firstname");
	By lastName = By.id("lastname");
	By dateBirth = By.id("birthdate");
	By gender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
	By street = By.id("streetaddress");
	By country = By.id("country");
	By zip = By.id("zipcode");
	By city = By.id("city");
	By occupation = By.id("occupation");
	By hobbie = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span");
	By site = By.id("website");
	By nextProductData = By.id("nextenterproductdata");

	// Elementos da aba Enter Product Data

	By date = By.cssSelector("#startdate");
	By insuranceSum = By.cssSelector("#insurancesum");
	By merit = By.cssSelector("#meritrating");
	By damage = By.id("damageinsurance");
	By optionalProduct = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]/span");
	By courtesy = By.id("courtesycar");
	By nextSelectPrice = By.id("nextselectpriceoption");

	// Elementos da aba select Price Option

	By selectUltimate = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span");
	By nextSendQuote = By.id("nextsendquote");

	// Elementos da aba SendQuote

	By email = By.id("email");
	By phone = By.id("phone");
	By userName = By.id("username");
	By password = By.id("password");
	By confirmPass = By.id("confirmpassword");
	By send = By.id("sendemail");
	By finalOk = By.xpath("/html/body/div[4]/div[7]/div/button");

}
