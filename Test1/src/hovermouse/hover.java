package hovermouse;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class hover {
	
	WebDriver driver ;
	
	public void invokebrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:/ShuchiAutomation/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			mouse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void mouse()
	{
		try {
			driver.get("https://www.clubfactory.com/home.html");
			 WebElement element1 = driver.findElement(By.xpath("/html/body/section/header/div/div[1]/ul/li[1]/div"));

			    Actions action1 = new Actions(driver);

			    action1.moveToElement(element1).build().perform();

			     WebElement element2 = driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/div[1]"));
			     element2.click();
			     action1.moveToElement(element2).build().perform();
			   Thread.sleep(2000);
			   driver.findElement(By.xpath("/html/body/div[2]/ul/li[2]/div[2]/ul/div/li[8]")).click();
			 
			    
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		hover obj1 = new hover();
		obj1.invokebrowser();
	}

}
