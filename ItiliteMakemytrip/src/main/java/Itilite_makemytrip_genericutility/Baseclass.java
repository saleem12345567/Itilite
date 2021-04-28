package Itilite_makemytrip_genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Itilite_makemytrip_pom.Homepage;



public class Baseclass {


	   Fileutility futil=new Fileutility();
	   Webdriverutility wutil= new Webdriverutility();
		public static WebDriver driver;
		
		@BeforeClass
		public void configBC() throws Throwable {
			System.out.println("=============launch the browser================");
		
			
			 String URL = futil.getPropertykeyValue("url");
			 String BROWSER = futil.getPropertykeyValue("browser");
			 /* launch the browser*/
			  if(BROWSER.equals("chrome")) {
				  System.setProperty("webdriver.chrome.driver", "E:/ItiliteMakemytrip/src/Softwares/chromedriver.exe");
				  driver = new ChromeDriver();
			  }else if(BROWSER.equals("firefox"))
				  System.setProperty("webdriver.gecko.driver", "E:/ItiliteMakemytrip/src/Softwares/geckodriver.exe");
				  driver=new FirefoxDriver();
		}
			
		@BeforeMethod
		public void configBM() throws Throwable {
			System.out.println("==============login==========");
			 String USERNAME = futil.getPropertykeyValue("username");
			 String PASSWORD = futil.getPropertykeyValue("password");
			  
			
			 Homepage hp = new Homepage(driver);
			 hp.bookflight();
		}
			  @AfterMethod
				public void configAM() {
					System.out.println("==============logout==========");
			  }
			  
			  @AfterClass
				public void configAC() {
					System.out.println("=============close the browser================");
					  driver.close();
					
					
			  }
}
