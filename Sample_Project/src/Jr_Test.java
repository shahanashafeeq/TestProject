import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Jr_Test {
	
	WebDriver driver;
	
	@BeforeMethod
	public void getUrl(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shahana\\Desktop\\Eclipse\\eclipse\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.jrrubbermoulds.com/");
		driver.manage().window().maximize();
	}
	

}
