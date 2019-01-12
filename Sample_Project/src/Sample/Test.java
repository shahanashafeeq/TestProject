package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test {

	public static void main(String[] args) {
		c;
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", false);
		WebDriver driver = new FirefoxDriver(options);
					
		
		driver.get("https://www.jrrubbermoulds.com/");
		 driver.manage().window().maximize();
	//	WebElement d=driver.findElement(By.xpath("/html/body/header/div[5]/div/div/div/nav/div/ul/li[2]/div/a[1]"));
	//	d.click();
		driver.manage().timeouts().implicitlyWait(1000000,TimeUnit.SECONDS);
	//	WebElement q=driver.findElement(By.xpath("/html/body/header/div[5]/div/div/div/nav/div/ul/li[2]/a"));
	//	q.click();
		
	//   WebElement w=driver.findElement(By.xpath("/html/body/header/div[5]/div/div/div/nav/div/ul/li[2]/div/a[1]"));
 	//	w.click();
		WebElement a=driver.findElement(By.xpath("/html/body/section[1]/div/form/div/div[2]/input"));
	    a.sendKeys("cc");
	    WebElement b=driver.findElement(By.xpath("/html/body/section[1]/div/form/div/div[3]/input"));
		b.submit();
		
		
		WebElement e=driver.findElement(By.linkText("View More"));
		e.click();
		
		 
	//	WebElement c=driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[3]/div/span[1]/a"));
	//	c.click();
		
	//	WebElement d=driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[3]/div/span[2]/a"));
	//	d.click();
		

	}

}
