package WebsiteApp1.WebsiteApp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;
import org.junit.Test;

public class AppTest {

	@Test
    public void test() 
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\tools\\selenium\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://jonathan-overy.neocities.org/");
    	String title = driver.getTitle();
    	Assert.assertEquals("", title);
    	

    	System.out.println("Successfully opened the website jonathan-overy");
    }
    }
	