package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	
	@Test
	public void sample()
	{
System.setProperty("webdriver.chrome.driver","./src/main/resources/softwares/chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        
        
        driver.quit();
	}

}
