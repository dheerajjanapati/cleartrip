package functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class adminlogin 
	{
		@FindBy(name="txtUsername")
		WebElement uid;
		@FindBy(name="txtPassword")
		WebElement pwd;
		@FindBy(name="Submit")
		WebElement submit;

public void adminlogin(String uname, String pswd)
{
	uid.sendKeys(uname);
	pwd.sendKeys(pswd);
	submit.click();

}}