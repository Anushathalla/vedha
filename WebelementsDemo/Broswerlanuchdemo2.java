package WebelementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broswerlanuchdemo2 
{

	public static void main(String[] args)
	{
	WebDriver driver =new ChromeDriver();
	driver.get("https://mail.google.com/mail/u/0/#inbox");
	//driver.findElement(By.id("identifierId")).sendKeys("RBG techonologies1");
	//driver.findElement(By.name("identifier")).sendKeys("RBG techonologies2");
	driver.findElement(By.name("identifier")).sendKeys("RBG techonologies3");
	
	}

}
