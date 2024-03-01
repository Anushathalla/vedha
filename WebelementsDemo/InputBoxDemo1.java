package WebelementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxDemo1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='identifiers']"));

		boolean expectedDisplay = true;
		boolean actualDisplay = inputbox.isDisplayed();
		System.out.println("actualaDisplay:"+actualDisplay);
		if(actualDisplay==expectedDisplay)
		{
			System.out.println("inputbox is Displayed");
		}
		else
		{
			System.out.println(" inputbox is not displayed");

		}

		boolean expectedEnabled = true;
		boolean actualEnabled = inputbox .isEnabled();
		System.out.println("actualaEnable:"+actualEnabled);
		if(actualEnabled==expectedEnabled)
		{
			System.out.println(" inputbox isEnabled");
		}
		else
		{
			System.out.println(" inputbox is not Enabled");	
		}
		String expcetedwatermarkData = inputbox.getAttribute("arial-label");
		String actualWatermarkData	 = "emial or phone";	
		if(actualWatermarkData ==expcetedwatermarkData)
		{
			System.out.println("watermarkData is displayed");
		}
		else
		{
			System.out.println("watermarkdata is not displayed");
		}
		inputbox.sendKeys("RBG technologies");
		String actualEnterData = inputbox.getAttribute("value");
		String expectedEnterData = "RBG technologies";
		if(actualEnterData==expectedEnterData)
		{
			System.out.println("EnterData is dispalyed");
		}
		else
		{
			System.out.println("EnterData is not displayed");
		}

	}

}


