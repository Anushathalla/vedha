package WebelementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Broswerlanuchdemo3 
{

	public static void main(String[] args)
	{
WebDriver driver= new EdgeDriver();
driver.get("https://demo.guru99.com/test/newtours/");
driver.findElement(By.name("userName")).sendKeys("RBG techonologies1");
//driver.findElement(By.xpath("//input[@name = 'userName'")).sendKeys("RBG techonologies1");
	}
	}


