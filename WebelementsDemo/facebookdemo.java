package WebelementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookdemo 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement  facebookinputbox= driver.findElement(By.xpath("//input[@id ='email']"));
		
		boolean expectedDisplay = true;
		boolean actualDisplay =  facebookinputbox .isDisplayed();
		System.out.println("actualaDisplay:"+actualDisplay);
		if(actualDisplay==expectedDisplay)
		{
			System.out.println(" facebookinputbox  is Displayed");
		}
		else
		{
			System.out.println(" facebookinputbox  is not displayed");

		}

		boolean expectedEnable = true;
		boolean actualEnable =  facebookinputbox .isEnabled();
		System.out.println("actualEnable:"+actualEnable);
		if(actualEnable==expectedEnable)
		{
			System.out.println(" facebookinputbox  is Enable");
		}
		else
		{
			System.out.println(" facebookinputbox  is not Enable");
		}
		String actualWatermarkData = facebookinputbox .getAttribute("aria-label");
		System.out.println("actualWatermarkData:"+actualWatermarkData);
		String expectedWatermarkData ="Email address or phone number";
		if(actualWatermarkData ==expectedWatermarkData)
		{
			System.out.println("WatermarkData is displayed as expected");
		}
		else
		{
			System.out.println("WatermarkData is  not displayed as expected");
		}
		facebookinputbox .sendKeys("RBG technologies"); 

		String expectedEnterData = "RBG technologies";
		String  actualEnterData = facebookinputbox .getAttribute("value");
		if(actualEnterData.equals(expectedEnterData))
		{
			System.out.println("Enter data is validate");
		}
		else
		{
			System.out.println("Enter data is not validate");
		}
	}


	

}

