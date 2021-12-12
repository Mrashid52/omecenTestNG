package omecenTestNG.base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

 public static WebDriver driver;
//@Test
public void oppenApp() {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://inventory.omecen.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Assert.assertEquals(driver.getTitle(),"A Product of Bost IT Solution - Inventory");
	
}

}
