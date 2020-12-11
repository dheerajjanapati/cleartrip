package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys("janapatidheera");
        driver.findElement(By.xpath("//div/div[1]/div/div/button/div[2]")).click();
 String text=driver.findElement(By.xpath("//section/div/div/div[1]/div/div[2]/div[2]/div")).getAttribute("class");
 System.out.println(text);
 driver.close();
        
		
	}
		

	}


