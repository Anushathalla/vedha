package WebelementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class labeltest1 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
	driver.get("");
	WebElement label = driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
	String excpetedData = "to continue to Gmail";
	String aceptedData = label.getText();
	if(aceptedData.equals(excpetedData))
	{
		System.out.println("Label is matching");
	}
	else
	{
		System.out.println("Label is not macthing");
	}
	}

}
