import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Page {
	
	public static WebDriver driver = null;
	
	public static final int waitTime = 12;

	//********Constructor********
	
	public Base_Page() {
		
		
	}
	//********End Constructor********
	
	//********Web Elements********
	public static WebElement element = null;
	public static WebDriverWait wait = null;
	//********End Web Elements********
	
	//********Page Elements********
	
	//********End Page Elements********
	
	//********Page Methods********
	
	public void check_ready(By elementBy) {
		wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.elementToBeClickable(elementBy));
	}
	
	public void check_ready(WebElement element) {
		wait = new WebDriverWait(driver, waitTime);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void click(By elementBy) {
		check_ready(elementBy);
		driver.findElement(elementBy).click();
	}
	
	public void writeText(By elementBy, String text) {
		check_ready(elementBy);
		driver.findElement(elementBy).sendKeys(text);
	}
	
	public void writeText(WebElement element, String text) {
		check_ready(element);
		element.sendKeys(text);
	}
	
	//********End Page Methods********
}
