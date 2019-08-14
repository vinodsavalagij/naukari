package POM.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;







public class LogInPage extends BasePage 
{

	public LogInPage(WebDriver driver) {
		super(driver);}
		// TODO Auto-generated constructor stubc
		
		
		@FindBy(xpath="//input[@id='usernameField']")
		WebElement username;
		
		@FindBy(xpath="//input[@id='passwordField']")
		WebElement password;
		
		@FindBy(xpath="//button")
		WebElement login;
		
		public void login()
		{
			
			login.click();
		}
		
		
		
		public void setUserName(String un)
		{
			
			username.sendKeys(un);
		}

		public void setPassword(String pw)
		{
			password.sendKeys(pw);
		}
}
