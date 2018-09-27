package naukrisite;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class naukri {

	WebDriver driver;
	
	public void browser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:/ShuchiAutomation/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.naukri.com/");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void searchJob()
	{
		try {
			driver.findElement(By.className("searchJob")).click();
			driver.findElement(By.className("sugInp")).sendKeys("Manual testing");
			driver.findElement(By.name("ql")).sendKeys("Noida");
			driver.findElement(By.className("dWrap")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[@id='a3']")).click();
			driver.findElement(By.id("qsbFormBtn")).click();
			//driver.switchTo().window("https://www.naukri.com/manual-testing-jobs-in-noida");
			
		} catch (Exception e) {
			e.printStackTrace();
		}			
	}
	
	public void login()
	{
		try {
			driver.findElement(By.xpath("//*[@id='login_Layer']/child::div")).click();
			Thread.sleep(700);
			driver.findElement(By.id("eLoginNew")).sendKeys("shuchee.agrawal@gmail.com");
			driver.findElement(By.id("pLogin")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@id=\"lgnFrmNew\"]/div[9]/button")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/span/div/div/div[2]/div[1]/div[2]/div[1]/div/div[1]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"lazyKeySkills\"]/div/div/div/div[1]/span[2]")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id=\"saveKeySkills\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 2100)");
			Thread.sleep(700);
			WebElement searchElement = driver.findElement(By.xpath("//*[@id=\"attachCV\"]"));
			//js.executeScript("arguments[0].scrollIntoView();", searchElement);
			// To upload resume
			//WebElement upload1 = driver.findElement(By.id("attachCV"));
			searchElement.click();
			searchElement.sendKeys("G:\\Rishi_Study\\Resume");
			System.out.println("Uploaded");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		naukri obj = new naukri();
		obj.browser();
		//obj.searchJob();
		obj.login();
	}

}
