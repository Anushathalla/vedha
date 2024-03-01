package WebelementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo3
{

	public static void main(String[] args)
	{


		WebDriver driver = new ChromeDriver();
		driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
		WebElement CheckBox  = driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
		boolean expectedDisplay = true;
		boolean actualDisplay =CheckBox .isDisplayed();
		System.out.println("actualaDisplay:"+actualDisplay);
		if(actualDisplay==expectedDisplay)
		{
			System.out.println("CheckBox is Displayed");
		}
		else 
		{
			System.out.println("CheckBox is not displayed");

		}

		boolean expectedEnabled = true;
		boolean actualEnabled =CheckBox .isEnabled();
		System.out.println("actualaEnable:"+actualEnabled);
		if(actualEnabled==expectedEnabled)
		{
			System.out.println("CheckBox isEnabled");
		}
		else
		{
			System.out.println("CheckBox is not Enabled");

		}


		boolean expectedSelected = true;
		boolean actualSelected =CheckBox .isSelected();
		System.out.println("actualaSelected:"+actualSelected);
		if(actualSelected==expectedSelected)
		{
			System.out.println("CheckBox is Selected");
		}
		else
		{
			System.out.println("CheckBox is not Selected");

		}
		CheckBox.click();
	}
}




