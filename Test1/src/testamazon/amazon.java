package testamazon;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class amazon {

	WebDriver driver;
	
	public void invokeBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","C:/ShuchiAutomation/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//	getCommands();
		//	navigateCommands();
			elements();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void getCommands()
	{
		try {
			driver.get("https://www.amazon.in/");
			String titleOfThePage = driver.getTitle();
			System.out.println("Title of the page is : " +titleOfThePage);
			driver.findElement(By.linkText("Today's Deals")).click();
			String currentUrl = driver.getCurrentUrl();
			System.out.println("The current URL is : " +currentUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void navigateCommands()
	{
		try {
			driver.navigate().to("https://www.yatra.com/");
			driver.findElement(By.className("container")).click();
			driver.navigate().back();
			driver.navigate().forward();
			Thread.sleep(2000);
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void elements()
	{
		try {
			driver.get("https://www.amazon.in/");
			Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
			dropdown.selectByVisibleText("Appliances");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
			driver.findElement(By.className("nav-input")).click();
			// for scrolling
			JavascriptExecutor js = (JavascriptExecutor) driver;
			// js.executeScript("window.scrollBy(0, 1000)");
			
			WebElement searchElement = driver.findElement(By.xpath("//*[@id=\"result_6\"]/div/div[3]/div[1]/a"));
			js.executeScript("arguments[0].scrollIntoView();", searchElement);
					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	
		amazon obj1 = new amazon();
		obj1.invokeBrowser();
		//obj1.closeBrowser();

	}

}
