package Itilite_makemytrip_pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	//Login
    
	   @FindBy(xpath="//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser']")
	   private WebElement LoginLnk;
	
		
		@FindBy(xpath="//input[@id='username']")
		private WebElement Usnbtn;
		
		@FindBy(xpath="//span[.='Continue']")
		private WebElement ConBtn;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement Pwdbtn;
		
		@FindBy(xpath="//button[@data-cy='login']")
		private WebElement Loginbtn;
		
		
		
		//Add Traveller
		
		@FindBy(xpath="(//span[@class='lbl_input latoBold appendBottom10'])[3]")
		private WebElement travellerLnk;
		
		@FindBy(xpath="//li[@class='selected']")
		private WebElement selectBtn;
		
		@FindBy(xpath="//button[.='APPLY']")
		private WebElement applyBtn;
		
		//Flight search
		
		@FindBy(xpath="//li[@data-cy='roundTrip']")
		private WebElement roundRadioBtn;
		
		@FindBy(xpath="//p[.='Bangalore, India']")
		private WebElement fromBtn;
		
		@FindBy(xpath="//p[.='Mumbai, India']")
		private WebElement toBtn;
		
		@FindBy(xpath="//span[@class='selectedDateField appendBottom8 pointer'])[1]")
		private WebElement departuredate;
		
		@FindBy(xpath="(//span[@class='selectedDateField appendBottom8 pointer'])[2]")
		private WebElement returndate;
		
		//select BusinessClass
		
		@FindBy(xpath="(//span[@class='lbl_input latoBold appendBottom10'])[3]")
		private WebElement travellerLnk2;
		
		@FindBy(xpath="//li[.='Business']")
		private WebElement selectBusinessclass;
		
		@FindBy(xpath="//button[.='APPLY']")
		private WebElement ApplyBtn;
		
		@FindBy(xpath="//a[.='Search']")
		private WebElement SearchBtn;
		
		//Logout
		
		@FindBy(xpath="//p[.='Logout']")
		private WebElement LogoutBtn;
		
	
		
		public Homepage(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		
		
		public WebElement getLoginLnk() {
			return LoginLnk;
		}

		public WebElement getUsnbtn() {
			return Usnbtn;
		}

		public WebElement getConBtn() {
			return ConBtn;
		}

		public WebElement getPwdbtn() {
			return Pwdbtn;
		}

		public WebElement getLoginbtn() {
			return Loginbtn;
		}

		public WebElement getTravellerLnk() {
			return travellerLnk;
		}

		public WebElement getSelectBtn() {
			return selectBtn;
		}


		public WebElement getRoundRadioBtn() {
			return roundRadioBtn;
		}

		public WebElement getFromBtn() {
			return fromBtn;
		}

		public WebElement getToBtn() {
			return toBtn;
		}

		public WebElement getDeparturedate() {
			return departuredate;
		}

		public WebElement getReturndate() {
			return returndate;
		}

		public WebElement getTravellerLnk2() {
			return travellerLnk2;
		}

		public WebElement getSelectBusinessclass() {
			return selectBusinessclass;
		}
		
		public WebElement getApplyBtn() {
			return ApplyBtn;
		}

		public WebElement getSearchBtn() {
			return SearchBtn;
		}

		public WebElement getLogoutBtn() {
			return LogoutBtn;
		}

		
		public void bookflight(){
			LoginLnk.click();
			 Usnbtn.sendKeys("saleems41996@gmail.com");
			 ConBtn.click();
			 Pwdbtn.sendKeys("Test@#1014");
			 travellerLnk.click();
			 selectBtn.click();
			 roundRadioBtn.click();
			 fromBtn.click();
			 toBtn.click();
			 departuredate.click();
			 returndate.click();
			 travellerLnk2.click();
			 selectBusinessclass.click();
			 ApplyBtn.click();
			 SearchBtn.click();
			 LogoutBtn.click();
		}

		public static void 	bookflight1(WebDriver driver,WebElement element,String dateVal){
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		}

}
