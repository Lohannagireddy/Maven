package amazonLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class LoginOperations{

	@BeforeTest
	public void openBrowser(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.refresh();
	}
	
}
