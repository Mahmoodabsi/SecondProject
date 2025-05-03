import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Myclass {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void myStup() {
		
		driver.get("http://www.google.com");
		
		
		
	}
	@Test
	public void myTest() {
		
		
		
	}
	

}
