package Itilite_makemytrip_testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddTravellers{
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:/ItiliteMakemytrip/src/Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser']")).click();
		//driver.findElement(By.xpath("//div[@class='makeFlex column flexOne whiteText latoBold']")).click();
	   // driver.findElement(By.xpath("//p[@class='font14 latoBold blackText appendBottom5 cursorPointer makeRelative']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("saleems41996@gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[.='Continue']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@#1014");
		driver.findElement(By.xpath("//button[@data-cy='login']")).click();
        
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Add travellers
		
		driver.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10'])[3]")).click();
		driver.findElement(By.xpath("//li[@class='selected']"));
		driver.findElement(By.xpath("//button[.='APPLY']")).click();
		
		//Flight Search
		
		driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//p[.='Bangalore, India']"));
		driver.findElement(By.xpath("//p[.='Mumbai, India']"));
		
	
		WebElement  Departuredate=driver.findElement(By.xpath("(//span[@class='selectedDateField appendBottom8 pointer'])[1]"));
		String dateVal="01-05-2021";
        selectDatebyJs(driver,Departuredate,dateVal);
        
        WebElement Returndate = driver.findElement(By.xpath("(//span[@class='selectedDateField appendBottom8 pointer'])[2]"));
        String dateVal1="07-05-2021";
        selectDatebyJs(driver,Returndate,dateVal1);
		
	}
	public static void selectDatebyJs(WebDriver driver,WebElement element,String dateVal){
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		
		//select Businessclass
		driver.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10'])[3]")).click();
		driver.findElement(By.xpath("//li[.='Business']")).click();
		driver.findElement(By.xpath("//button[.='APPLY']")).click();
		
		//search
		driver.findElement(By.xpath("//a[.='Search']")).click();
		
		//Book Ticket
		
		//Select Flight
		driver.findElement(By.xpath("(//span[@class='inner'])[2]")).click();//select flight from Bangalore 
		driver.findElement(By.xpath("//button[.='Book Now']")).click();//book flights for both sides
		
		//Display Output
		WebElement actualfare=driver.findElement(By.xpath("(//p[.='₹ 39,640'])[2]"));
		System.out.println(actualfare);
		
		driver.findElement(By.xpath("//button[.='Continue']")).click();
		
		
	}
	

}
