package trafficbot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webbot {

	public static void main(String[] args) {

		System.setProperty("webdriver.Chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#js-link-box-en > strong")).click();
		driver.findElement(By.id("searchInput")).sendKeys("selenium software");
		driver.findElement(By.id("searchButton")).click();
		driver.findElement(By.linkText("Selenium (software)")).click();
			
			try{
			Thread.sleep(1500);
			}
			catch(InterruptedException ie){
			}
			
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#js-link-box-en > strong")).click();
		driver.findElement(By.id("searchInput")).sendKeys("selenium software");
		driver.findElement(By.id("searchButton")).click();
		driver.findElement(By.linkText("Selenium (software)")).click();
		driver.close();

	}

}
