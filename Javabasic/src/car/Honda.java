package car;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Honda {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Wedriver.chrome.driver",
				"C:\\Users\\account\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//delete cookies
		//driver.manage().deleteAllCookies();
		
//		//youtube
//		driver.get("https://www.youtube.com/");
//		//maximize
//		driver.manage().window().maximize();
//		
//		for(int i=0;i<5;i++)
//		{
//			driver.navigate().to("https://www.youtube.com/watch?v=AhqN54kIkZU");
//			Thread.sleep(800000000);
//			driver.close();
//		}
		//WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		//search.sendKeys(args)
		
		driver.get("https://www.spicejet.com/");
		
		//*[contains(text(),"BLR")]
		//driver.findElement(By.className("css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu")).click();
driver.findElement(By.xpath("//*[contains(text(),BLR - Bengaluru, India"));
Thread.sleep(12000);
driver.quit();
ChromeOptions p = new ChromeOptions();
p.addArguments("--disable-notifications");
System.out.println("captured");
driver.findElement(By.xpath("//*[@id='close']")).click();

	}

}
