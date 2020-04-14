

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landing_Page extends Base_Page {


	//********Constructor********
	public Landing_Page() {

	}

	//********End Constructor********
	
	//********Web Elements********
	public static WebElement element = null;
	
	static By inputBoxBy = By.id("query");
	
	//********End Web Elements********
	
	//********Page Elements********
	
	public static WebElement inputBox(WebDriver driver) {
		element = driver.findElement(inputBoxBy);
		return element;
	}
	
	//********End Page Elements********
	
	//********Page Methods********
	
	public void enterSearchTerm(String searchTerm) {
//		writeText(inputBoxBy, searchTerm);
//		driver.findElement(inputBoxBy).sendKeys(Keys.ENTER);
	    driver.findElement(By.id("query")).click();
	    driver.findElement(By.id("query")).sendKeys("keyboard");
	    driver.findElement(By.id("query")).sendKeys(Keys.ENTER);
	}
	
	//********End Page Methods********
	
}
