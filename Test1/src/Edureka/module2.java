package Edureka;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class module2 {
	
	WebDriver driver;
	
	public void  launch()
	{
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:/ShuchiAutomation/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.edureka.co/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void element()
	
		{
			try {
				driver.findElement(By.id("homeSearchBar")).sendKeys("selenium");
				driver.navigate().to("https://www.edureka.co/");
				driver.findElement(By.className("modalopen")).click();
				driver.navigate().to("https://www.edureka.co/");
				driver.findElement(By.name("user_v1[query]")).sendKeys("selenium");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}

	
	public static void main(String[] args)
	{
	
		module2 obj = new module2();
		obj.launch();
		obj.element();
		
	}
	
}