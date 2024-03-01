package WebelementsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/");
		WebElement loginButton= driver.findElement(By.xpath("//button[@name='login']"));

		boolean expectedDisplay = true;
		boolean actualDisplay = loginButton.isDisplayed();
		System.out.println("actualaDisplay:"+actualDisplay);
		if(actualDisplay==expectedDisplay)
		{
			System.out.println("loginButton is Displayed");
		}
		else
		{
			System.out.println("loginButton is not displayed");

		}

		boolean expectedEnabled = true;
		boolean actualEnabled =loginButton .isEnabled();
		System.out.println("actualaEnable:"+actualEnabled);
		if(actualEnabled==expectedEnabled)
		{
			System.out.println("loginButton isEnabled");
		}
		else
		{
			System.out.println("loginButton is not Enabled");

		}
		String actualloginButton=loginButton.getText();
		System.out.println("actualloginButton:="+actualloginButton);
		String expectedloginButton ="Log In";
		if(actualloginButton.equals(expectedloginButton))
		{
			System.out.println("loginButton is displayed");
		}
		else
		{
			System.out.println("loginButton is  not displayed");
		}
		loginButton.click();
	}
}
