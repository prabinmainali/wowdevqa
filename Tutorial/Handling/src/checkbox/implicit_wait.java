package checkbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.Chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.booking.com//");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.NANOSECONDS);
		
		driver.findElement(By.id("ss")).sendKeys("ktm");
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[3]/div/div[1]/div[1]/div/div/div/div[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"hotellist_inner\"]/div[1]/div[2]/div[1]/div[1]/div[1]/h3/a")).click();
		
		
	}

}
