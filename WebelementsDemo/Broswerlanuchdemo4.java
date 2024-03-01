package WebelementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Broswerlanuchdemo4 
{

	public static void main(String[] args) 
	{
WebDriver driver = new EdgeDriver();
driver.get("https://demo.guru99.com/test/newtours");
driver.findElement(By.name("password")).sendKeys("RBG techonologies 2");
	}

}
