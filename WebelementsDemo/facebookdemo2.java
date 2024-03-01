package WebelementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookdemo2 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("");
		WebElement facebooklogin = driver.findElement(By.xpath("//input[@id='caddoptional']"));
		
		boolean expectedDisplay = true;
		boolean actualDisplay =  facebooklogin.isDisplayed();
		System.out.println("actualaDisplay:"+actualDisplay);
		if(actualDisplay==expectedDisplay)
		{
			System.out.println("facebooklogin is Displayed");
		}
		else
		{
			System.out.println("facebooklogin is not displayed");

		}

		boolean expectedEnable = true;
		boolean actualEnable = facebooklogin.isEnabled();
		System.out.println("actualEnable:"+actualEnable);
		if(actualEnable==expectedEnable)
		{
			System.out.println("facebooklogin is Enable");
		}
		else
		{
			System.out.println("facebooklogin is not Enable");

		}
		

		String actualWatermarkData =facebooklogin.getAttribute("aria-label");
		System.out.println("actualWatermarkData:"+actualWatermarkData);
		String expectedWatermarkData ="Password";
		if(actualWatermarkData ==expectedWatermarkData)
		{
			System.out.println("WatermarkData is displayed as expected");
		}
		else
		{
			System.out.println("WatermarkData is  not displayed as expected");
		}
		
		facebooklogin.sendKeys(" vedha"); 

		String expectedEnterData = " vedha";
		String  actualEnterData =facebooklogin.getAttribute("value");
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
	