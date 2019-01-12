package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jr_Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shahana\\Desktop\\Eclipse\\eclipse\\drivers\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", false);
		WebDriver test = new FirefoxDriver(options);
		
		test.get("https://www.jrrubbermoulds.com/");
		test.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait (test, 30);
		WebElement x = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("ENQUIRY")));
		//WebElement x=test.findElement(By.xpath("/html/body/footer/div/div/div/div[5]/div[1]/ul/li[1]/a/i"));
		x.click();
		 
		// WebElement y=test.findElement(By.linkText("View More"));
		// y.click();

	}

}
