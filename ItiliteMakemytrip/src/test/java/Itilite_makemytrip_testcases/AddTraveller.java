package Itilite_makemytrip_testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Itilite_makemytrip_genericutility.Baseclass;

import Itilite_makemytrip_pom.Homepage;

public class AddTraveller extends Baseclass {
	
@Test
	
	//Section1

		public void traveller( ){
			Homepage hp=new Homepage(driver);
			hp.bookflight();
			
					
		}	

	//Section2

		public void bookflight1(WebDriver driver, String Departuredate, String dateVal1){
			Homepage hp=new Homepage(driver);
			hp.getDeparturedate();
			String dateVal="01-05-2021";
			bookflight1(driver,Departuredate,dateVal);
		}    
		 public void bookflights(WebDriver driver, String Returndate, String dateVal2){
		     Homepage hp=new Homepage(driver);
			 hp.getReturndate();
			 String dateVal="07-05-2021";
			 bookflights(driver,Returndate,dateVal);

		 }

			


}
