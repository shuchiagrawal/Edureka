package login;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.*;

public class login {
	
	WebDriver driver;
	
	public void browser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:/ShuchiAutomation/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			facebook();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void facebook()
	{
		try {
			driver.get("http://demo.guru99.com/test/facebook.html");
			driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("abcdefghlkjl");
			//for checkbox
			WebElement checkbox = driver.findElement(By.id("persist_box"));
			checkbox.click();
			if(checkbox.isSelected())
			{
				System.out.println("checkbox is selected");
			}
			else
			{
				System.out.println("Checkbox is not selected");
			}
			driver.findElement(By.id("u_0_b")).click();
			Thread.sleep(2000);
			driver.get("http://demo.guru99.com/test/radio.html");
			//foe radio button
			driver.findElement(By.id("vfb-7-2")).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args) {
		login obj1 = new login();
		obj1.browser();	
	}

}
