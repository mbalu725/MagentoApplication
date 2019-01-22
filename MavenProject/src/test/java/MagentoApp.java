

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoObjects.Home;
import com.abc.magentoObjects.LogOut;
import com.abc.magentoObjects.Login;

public class MagentoApp {

	public static void main(String[] args) {
		String url = "http://www.magento.com";
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
		
		Home h = new Home(driver);
		h.cliclOnMyAcc();
		
		Login l = new Login(driver);
		l.typeEmail("nitinmanjunath1991@gmail.com");
		l.typePassword("Welcome123");
		l.clickOnLogin();
		
		LogOut l1=new LogOut(driver);
		l1.clickOnLogout();
		
		
		driver.quit();
	}

}
