package checkbox;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validating_ui {
	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.Chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://spicejet.com");
			
			Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
						
			//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			
			driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
			System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
			
			driver.findElement(By.id("Div1")).getAttribute("style");
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
			{
				System.out.println("its enabled");
			}
			else
			{
				Assert.assertTrue(false);
			}
			
			driver.close();
		}
	}
