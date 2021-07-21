package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        int Links = driver.findElements(By.tagName("a")).size();
        // count no of links on page
        System.out.println("Number of links on Web Page :" +Links );
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement coloumndriver = footerdriver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElement(By.tagName("a")).getSize());
		
		for(int i = 0 ; i < coloumndriver.findElements(By.tagName("a")).size(); i++);
		{
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(0).sendKeys(clickonlinkTab);
		}
		
//		Thread.sleep(200);
//		driver.get("https://www.makeinjava.com");
//        int numberOfLinks = driver.findElements(By.tagName("a")).size();
//        // count no of links on page
//        System.out.println("Number of links on Web Page :" +numberOfLinks );
//		driver.close();
	}

}
