package WebelementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Tabletest2 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		WebElement UserNameInputBox = driver.findElement(By.xpath("//input[@name='identifier']"));
		
		boolean expectedDisplay = true;
		boolean actualDisplay = UserNameInputBox.isDisplayed();
		System.out.println("actualaDisplay:"+actualDisplay);
		if(actualDisplay==expectedDisplay)
		{
			System.out.println("UserNameInputBox is Displayed");
		}
		else
		{
			System.out.println("UserNameInputBox is not displayed");

		}

		boolean expectedEnable = true;
		boolean actualEnable = UserNameInputBox.isEnabled();
		System.out.println("actualEnable:"+actualEnable);
		if(actualEnable==expectedEnable)
		{
			System.out.println("UserNameInputBox is Enable");
		}
		else
		{
			System.out.println("UserNameInputBox is not Enable");

		}

		String actualWatermarkData =UserNameInputBox.getAttribute("aria-label");
		System.out.println("actualWatermarkData:"+actualWatermarkData);
		String expectedWatermarkData ="Email or phone";
		if(actualWatermarkData ==expectedWatermarkData)
		{
			System.out.println("WatermarkData is displayed as expected");
		}
		else
		{
			System.out.println("WatermarkData is  not displayed as expected");
		}
		UserNameInputBox.sendKeys("RBG technologies"); 

		String expectedEnterData = "RBG technologies";
		String  actualEnterData =UserNameInputBox.getAttribute("value");
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

















