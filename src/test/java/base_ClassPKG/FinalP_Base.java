package base_ClassPKG;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

public class FinalP_Base {
	
	public WebDriver Driver;
	
	@BeforeClass
	public void before() throws InterruptedException
	{
		Driver=new ChromeDriver();
		Driver.get("https://www.vastrado.com/");
	}

}
