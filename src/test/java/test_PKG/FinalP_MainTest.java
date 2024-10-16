package test_PKG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import base_ClassPKG.FinalP_Base;
import webPage_PKG.FinalP_WebPage;

public class FinalP_MainTest extends FinalP_Base {
	
	public void Products_AddToCart() throws InterruptedException
	{
		FinalP_WebPage ob=new FinalP_WebPage(Driver);
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		String ParentHandle= Driver.getWindowHandle();
		JavascriptExecutor js=(JavascriptExecutor) Driver;
		
		// PRODUCT 1: White Squarish Contrast Embroidered Kurta (Men)
		js.executeScript("window.scrollBy(0,600)");
		ob.Product1();
		
		// PRODUCT 2 - Premium Black Italian Linen Crinkled Shirt (Men)
		js.executeScript("window.scrollBy(0,1400)");
		ob.Product2_Part1();
		Set<String> Handles=Driver.getWindowHandles();
		for(String Handle: Handles)
		{
			System.out.println(Handle);	
			if(!Handle.equals(ParentHandle))
			{
				Driver.switchTo().window(Handle);
				System.out.println(Driver.getCurrentUrl());
				System.out.println("Handle: "+ Handle);
			}
		}
		String Product2Handle = Driver.getWindowHandle(); // Product page Handle
		System.out.println("Product2 Handle= "+ Product2Handle);
		ob.Product2_Part2();
		Thread.sleep(3000);
		Driver.switchTo().window(Product2Handle).close();
		
		// PRODUCT 3 - Floral Printed Crinkled Oversized Shirt (Woman)
		Driver.switchTo().window(ParentHandle);
		ob.Product3_Part1();
		js.executeScript("window.scrollBy(0,500)");
		
		// PRODUCT 4 - Blue Checkered Skirt (Women)
		ob.Product4_Part1();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1800)");
		ob.Product4_Part2();
	}
	
	public void Cart_Page() throws InterruptedException
	{
		FinalP_WebPage ob=new FinalP_WebPage(Driver);
		
		// CART PROCEEDING
		ob.CartPage();
		
		// PAYMENT & DETAILS (Frame Handling)
		ob.Payment_Details(null, null, null, null, null);
		
		// Remove From Cart
		String ParentHandle= Driver.getWindowHandle();
		Thread.sleep(3000);
		Driver.switchTo().window(ParentHandle);
		ob.UpdateCart();
	}
	
	public void Home_Page()
	{
		FinalP_WebPage ob=new FinalP_WebPage(Driver);
		
		ob.ReturnHome();
	}

}
