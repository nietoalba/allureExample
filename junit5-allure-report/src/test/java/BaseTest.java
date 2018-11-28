import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageGenerator;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public PageGenerator page;

    @BeforeEach
    public void classLevelSetup() {
		 //System.setProperty("webdriver.chrome.driver","");
			System.setProperty("webdriver.chrome.driver", "");

		 
		
		 //headless chrome
		ChromeOptions options = new ChromeOptions();
	        options.addArguments("headless");
	      //  options.addArguments("window-size=1200x600");
	        options.addArguments("--no-sandbox");
	        options.addArguments("--disable-dev-shm-usage");
	        
		    driver = new ChromeDriver(options);
		  //  baseUrl = "https://www.ico.es/";
		  //  driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		    
    	
        //driver = new ChromeDriver();
       // wait = new WebDriverWait(driver,15);
        //page = new PageGenerator(driver);
    }

    @AfterEach
    public void teardown () {
        driver.quit();
    }
}
