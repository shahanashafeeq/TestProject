import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Test {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shahana\\Desktop\\Eclipse\\eclipse\\drivers\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", false);
		driver = new FirefoxDriver(options);
		driver.get("https://www.jrrubbermoulds.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	@Test(priority=1)
	public void checkUrl(){
		System.out.println("Verify JR website URL is accessible");
		driver.get("https://www.jrrubbermoulds.com/");
		driver.manage().window().maximize();
		System.out.println("URL test completed");
		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		  
		}
	
	@Test(priority=2)
	public void checkTitle(){
		//String title=driver.getTitle();
		
		
		
		System.out.println("Testing the label");
		String abc = driver.getTitle();
		System.out.println(abc);
		System.out.println("Testing the label completed");
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}
	
	
	  @Test(priority=3)
	    public void rubberLink(){
		System.out.println("Verify the rubber  link is accessible");
		WebElement q=driver.findElement(By.xpath("/html/body/header/div[5]/div/div/div/nav/div/ul/li[3]/div/a[1]"));
		q.click();
		WebElement r=driver.findElement(By.xpath("/html/body/header/div[5]/div/div/div/nav/div/ul/li[3]/div/a[2]"));
		r.click();
		System.out.println("Testing rubber link completed");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	    }

	
	@Test(priority=4)
	public void linkTest(){
		System.out.println("Verify the link News and Events is accessible");
		driver.findElement(By.linkText("NEWS & EVENTS")).click();
		
		System.out.println("Testing the link  completed");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		}
	
	
	
	@Test(priority=5)
	public void contactLink(){
		System.out.println("Verify the contact us link is accessible");
		driver.findElement(By.linkText("CONTACT US")).click();
		
		System.out.println("Testing the contact us link completed");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=6)
	public void searchboxTest(){
		System.out.println("Verify the product entered is accessible");
		
		WebElement a=driver.findElement(By.xpath("/html/body/section[1]/div/form/div/div[2]/input"));
	    a.sendKeys("rubber moulds");
	    System.out.println("Testing product entered completed");
	    WebElement b=driver.findElement(By.xpath("/html/body/section[1]/div/form/div/div[3]/input"));
		b.submit();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}


 /*  @Test(priority=6)
    public void rubberLink(){
	System.out.println("Verify the rubber  link is accessible");
	driver.findElement(By.xpath("/html/body/header/div[5]/div/div/div/nav/div/ul/li[3]/div/a[1]")).click();
	
	System.out.println("Testing rubber link completed");
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	
    }
*/	
	@Test(priority=7)
	public void enquiryTest(){
		System.out.println("Verify the enquiry link is accessible");
		driver.findElement(By.linkText("ENQUIRY")).click();
		
		System.out.println("Testing enquiry link completed");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}
	
	@Test(priority=8)
	public void facebookLink(){
		System.out.println("Verify the facebook link is accessible");
		driver.findElement(By.xpath("/html/body/footer/div/div/div/div[5]/div[1]/ul/li[1]/a")).click();
		
		System.out.println("Testing facebook link completed");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
	}
	
	
	@Test(priority=9)
	public void twitterLink(){
		System.out.println("Verify the twitter link is accessible");
		driver.findElement(By.xpath("/html/body/footer/div/div/div/div[5]/div[1]/ul/li[2]/a/i")).click();
		
		System.out.println("Testing twitter link completed");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
	}


	
	
	@AfterMethod
	public void tearDown(){
		 driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.quit();
	}
	

}

