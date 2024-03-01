package WebelementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtondemo1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
        WebElement radioButton = driver.findElement(By.xpath("//input[@name='tripType'and @value='oneway']"));	 																													
		boolean expectedDisplay = true;
		boolean actualDisplay = radioButton.isDisplayed();
		System.out.println("actualaDisplay:"+actualDisplay);
		if(actualDisplay==expectedDisplay)
		{
			System.out.println("radioButton is Displayed");
		}
		else 
		{
			System.out.println("radioButton is not displayed");

		}

		boolean expectedEnabled = true;
		boolean actualEnabled = radioButton.isEnabled();
		System.out.println("actualaEnable:"+actualEnabled);
		if(actualEnabled==expectedEnabled)
		{
			System.out.println("radioButton isEnabled");
		}
		else
		{
			System.out.println("radioButton is not Enabled");
		}

		boolean expectedSelected = true;
		boolean actualSelected = radioButton.isSelected();
		System.out.println("actualaSelected:"+actualSelected);
		if(actualSelected==expectedSelected)
		{
			System.out.println("radioButton is Selected");
		}
		else
		{
			System.out.println("radioButton is not Selected");
		}
		radioButton.click();
		boolean expectedAfterSelected = true;
		boolean actualAfterSelected = radioButton.isSelected();
		System.out.println("actualaSelected:"+actualSelected);
		if(actualSelected==expectedSelected)
		{
			System.out.println("radioButton is Selected");
		}
		else
		{
			System.out.println("radioButton is not Selected");

		}

	}
	}


