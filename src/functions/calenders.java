package functions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftwa re.css.parser.selector.ChildSelector;

public class calenders {
	public static void main(String[] args) 
	{
	String year="2021",month="march", date="15";
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://cleartrip.com");
	driver.findElement(By.id("FromTag")).sendKeys("hyderabad");
	driver.findElement(By.id("ToTag")).sendKeys("mumbai");
	
	//calender
	driver.findElement(By.id("DepartDate")).click();
	String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
    while(!calyear.equals(year))
    {
    	driver.findElement(By.className("nextMonth")).click();
    	calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
    }
    String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
    while(!calmonth.equalsIgnoreCase(month))
    {
	 driver.findElement(By.className("nextMonth")).click();
	 calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
	}
WebElement cal;
cal=driver.findElement(By.className("calendar"));
List<WebElement> rows,cols;
rows=cal.findElements(By.tagName("tr"));
boolean choice=false;
for(int i=1;i<rows.size();i++)
{
	cols=rows.get(i).findElements(By.tagName("td"));
	for(int j=0;j<cols.size();j++)
	{
		String caldt=cols.get(j).getText();
		if(caldt.equals(date))
		{
			cols.get(j).click();
			choice=true;
			break;
		}
	}
	if(choice)
	{
		break;
	}
}
//adults
	Select adults=new Select(driver.findElement(By.name("adults")));
	adults.selectByValue("3");
	//childs
	Select childs=new Select(driver.findElement(By.name("childs")));
	childs.selectByValue("2");

// search flights
driver.findElement(By.id("SearchBtn")).click();
	}}
