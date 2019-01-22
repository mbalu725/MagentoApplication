
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home 
{
	WebDriver driver;

	public Home(WebDriver driver)
	{
		this.driver = driver;
	}
	By  myacc=By.linkText("My Account");   
	public void cliclOnMyAcc()
	{
		driver.findElement(myacc).click();
	}
}
