package webPage_PKG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;




public class FinalP_WebPage {
	
	WebDriver Driver;
	
// DATADRIVEN TEST LOCATORS
	@FindBy(xpath="/html/body/header/div/div/div[3]/div[3]/a") WebElement LoginMenu;
	@FindBy(xpath="/html/body/header/div/div/div[3]/div[3]/ul/li[2]/a") WebElement LoginLink;
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div[1]/div[2]/div[2]/div[1]/ul/li[1]/a") WebElement LoginWithEmail;
	@FindBy(name="email") WebElement Email;
	@FindBy(id="input-password") WebElement Password;
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div[1]/div[2]/div[2]/div[1]/div/div[1]/form/div[2]/input") WebElement LoginBtn;
	
// MAIN TEST LOCATORS
	// PRODUCT 1
	@FindBy(xpath="/html/body/div[4]/div[2]/div/div/div/div/section[1]/div/div/div[1]/a") WebElement MenCategoryBtn;
	@FindBy(id="544602_pdp_link") WebElement Product_1;
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div[4]/div[16]/div/div[3]/div/button[1]") WebElement AddToCartBtn1;
	@FindBy(xpath="//*[@id=\\\"input-option549194503\\\"]/div[3]") WebElement Product1_Size;
	//PRODUCT 2
	@FindBy(id="544617_pdp_link") WebElement Product_2;
	@FindBy(xpath="//*[@id=\\\"input-option549194518\\\"]/div[3]") WebElement Product2_Size;
	@FindBy(id="increase") WebElement QuantityIncrement;
	@FindBy(id="button-cart") WebElement AddToCartBtn2;
	//PRODUCT 3
	@FindBy(xpath="/html/body/header/div/div/div[2]/div[1]") WebElement HamburgerMenu;
	@FindBy(xpath="/html/body/header/div/div/div[4]/div/div[2]/div/div/ul[1]/li[3]/a") WebElement WomenMenu;
	@FindBy(xpath="/html/body/header/div/div/div[4]/div/div[2]/div/div/ul[1]/li[3]/div/div/div/div/div/div/div/ul/li[1]/a") WebElement AllWomen_SubMenu;
	@FindBy(id="539866_pdp_link") WebElement Product_3;
	@FindBy(xpath="//*[@id=\\\"ajax-product-list\\\"]/div[7]/div/div[3]/div/button[1]") WebElement AddToCartBtn3;
	@FindBy(xpath="//*[@id=\\\"input-option549188278\\\"]/div[3]") WebElement Product3_Size;
	// PRODUCT 4
	@FindBy(xpath="//*[@id=\\\"column-left\\\"]/div/div[3]/div[2]/div/a[6]") WebElement Filter_Colour;
	@FindBy(id="colourBeige") WebElement Filter_Colour_Biege;
	@FindBy(id="colourBlue") WebElement Filter_Colour_Blue;
	@FindBy(id="499677_pdp_link") WebElement Product_4;
	@FindBy(xpath="//*[@id=\\\"ajax-product-list\\\"]/div[19]/div/div[3]/div/button[1]") WebElement AddToCartBtn4;
	@FindBy(xpath="//*[@id=\\\"input-option549154027\\\"]/div[2]") WebElement Product4_Size;
	// Cart Page
	@FindBy(xpath="/html/body/header/div/div/div[3]/div[5]/button") WebElement CartMenuButton;
	@FindBy(xpath="//*[@id=\\\"cart\\\"]/ul/li[2]/div/p/a[1]") WebElement ViewCartOption;
	@FindBy(xpath="//*[@id=\\\"content\\\"]/div[1]/div/form/div/table/tbody/tr[4]/td[3]/select") WebElement DropDown_Quantity;
	@FindBy(xpath="//*[@id=\\\"collapse-coupon\\\"]/div/label/span") WebElement ViewCouponsOption;
	@FindBy(xpath="/html/body/div[3]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div/div[1]/div/div/div[2]/ul/li/input") WebElement CouponCheckbox_EXTRA10;
	@FindBy(xpath="//*[@id=\\\"couponapply-popup\\\"]/div/div/div[2]/form/div/button") WebElement Coupon_CheckOption;
	// Payment Details
	@FindBy(xpath="/html/body/div[3]/div[2]/div[2]/div/div[3]/div/div/button") WebElement ProceedToPay;
	@FindBy(xpath="//*[@id=\\\"gokwik-iframe\\\"]") WebElement IFrame;
	@FindBy(xpath="/html/body/div/div[1]/div[1]/div[2]/div/div/div[2]/div[1]/input") WebElement Phone;
	@FindBy(id="pincode-input") WebElement PinCode;
	@FindBy(id="name") WebElement Namee;
	@FindBy(id="email") WebElement EMail;
	@FindBy(id="address") WebElement Addresz;
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[1]/div/button") WebElement ContinueButton;
	@FindBy(xpath="/html/body/div/button") WebElement CloseButton_Frame;
	@FindBy(xpath="/html/body/div/div[3]/div/div[2]/button[1]") WebElement CloseButton_Frame_Verification;
	// Remove From Cart
	@FindBy(xpath="/html/body/div[3]/div[2]/div[1]/div/form/div/table/tbody/tr[3]/td[1]/div/div[2]/span/a[1]") WebElement Product1_Remove;
	@FindBy(xpath="/html/body/div[3]/div[2]/div[1]/div/form/div/table/tbody/tr[4]/td[1]/div/div[2]/span/a[1]") WebElement Product2_Remove;
	@FindBy(xpath="/html/body/div[3]/div[2]/div[1]/div/form/div/table/tbody/tr[5]/td[1]/div/div[2]/span/a[1]") WebElement Product3_Remove;
	@FindBy(xpath="/html/body/div[3]/div[2]/div[1]/div/form/div/table/tbody/tr[6]/td[1]/div/div[2]/span/a[1]") WebElement Product4_Remove;
	// Home Page Return
	@FindBy(xpath="/html/body/header/div/div/div[1]/div/a") WebElement Header_BrandLogo_HomeButton;
	
	
// DATADRIVEN TESTS
	public FinalP_WebPage(WebDriver Driver)
	{
		this.Driver=Driver;
		PageFactory.initElements(Driver, this);		
	}
	
	public void DataDrivenTest1()
	{
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LoginMenu.click();
		LoginLink.click();
		LoginWithEmail.click();
	}
	
	public void DataDrivenSetValues2(String Username, String PassKey)
	{
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Email.sendKeys(Username);
		Password.sendKeys(PassKey);
		
		LoginBtn.click();
	}
	
	public void DataDrivenFieldClear()
	{
		Email.clear();
		Password.clear();
	}
	
// MAIN TESTS 
	public void Product1() throws InterruptedException
	{
		// PRODUCT 1 - White Squarish Contrast Embroidered Kurta (Men)		
		MenCategoryBtn.click(); // Men Category Button
		WebElement Product1= Product_1;
		Actions act=new Actions(Driver);
		act.moveToElement(Product1).perform();
		AddToCartBtn1.click(); // Add to cart Button
		Product1_Size.click(); // Size: M
				
	}
	
	public void Product2_Part1()
	{
		// PRODUCT 2 - Premium Black Italian Linen Crinkled Shirt (Men)
		WebElement Product2=Product_2;
		Actions act=new Actions(Driver);
		act.contextClick(Product2).sendKeys(Keys.ENTER).build().perform(); // Open in a new tab
	}
	
	public void Product2_Part2()
	{
		Product2_Size.click(); // Size: M
		QuantityIncrement.click(); // Quantity Increment Button
		AddToCartBtn2.click(); // Add to Cart Button
	}
	
	public void Product3_Part1()
	{
		// PRODUCT 3 - Floral Printed Crinkled Oversized Shirt (Woman)
		HamburgerMenu.click(); // Hamburger Menu
		WomenMenu.click(); // Women Menu
		AllWomen_SubMenu.click(); // "All Women" Sub Menu
	}
	
	public void Product3_Part2()
	{
		WebElement Product3=Product_3;
		Actions act=new Actions(Driver);
		act.moveToElement(Product3).perform();
		AddToCartBtn3.click(); // Add to cart
		Product3_Size.click(); // Size: M
	}
	
	public void Product4_Part1() throws InterruptedException
	{
		// PRODUCT 4 - Blue Checkered Skirt (Women)
		Filter_Colour.click(); // Filter:Colour - Left Panel
		Filter_Colour_Biege.click(); // "Biege" CheckBox
		Thread.sleep(3000);
		Filter_Colour_Blue.click(); // "Blue" CheckBox
	}
	
	public void Product4_Part2()
	{
		WebElement Product4=Product_4;
		Actions act=new Actions(Driver);
		act.moveToElement(Product4).perform();
		AddToCartBtn4.click(); // Add to Cart
		Product4_Size.click(); // Size: S
	}
	
	public void CartPage() 
	{
		// CART PROCEEDING
		CartMenuButton.click(); // Cart Button
		ViewCartOption.click(); // View Cart Option
		WebElement Dropdown=DropDown_Quantity;
		Select sl=new Select(Dropdown);
		sl.selectByVisibleText("1");
		ViewCouponsOption.click(); // View Coupons
		CouponCheckbox_EXTRA10.click(); // Checkbox: EXTRA10 coupon
		Coupon_CheckOption.click(); // "Check" button for coupon
	}
	
	public void Payment_Details(String PhoneNumber, String Pincode, String Name, String Email, String Address) throws InterruptedException
	{
		// PAYMENT & DETAILS (Frame Handling)
		try {
			ProceedToPay.click(); // Proceed to pay Button
		}catch(StaleElementReferenceException e)
		{
			ProceedToPay.click();
		}
		Thread.sleep(5000);
		WebElement UserFrame=IFrame;
		Driver.switchTo().frame(UserFrame);
		Phone.sendKeys(PhoneNumber); // Phone number
		try {
		Driver.findElement(By.id("pincode-input")).sendKeys(Pincode);
		Namee.sendKeys(Name);
		EMail.sendKeys(Email);
		Addresz.sendKeys(Address);
		ContinueButton.click(); // Continue Button
		} catch(NoSuchElementException e)
		{
			System.out.println("Further Details can't Be Filled: Since it only proceeds after Mobile OTP Verification ");
		}
		CloseButton_Frame.click(); // Frame Close Button 'x'
		CloseButton_Frame_Verification.click(); // Frame Close Confirmation
	}
	
	public void UpdateCart() throws InterruptedException
	{
		// Remove From Cart
		Product1_Remove.click(); // 1st Product Remove
		Product2_Remove.click(); // 2nd Product Remove
		Product3_Remove.click(); // 3rd Product Remove
		Product4_Remove.click(); // 4th Product Remove
	}
	
	public void ReturnHome()
	{
		Header_BrandLogo_HomeButton.click(); // Return to Home Page By clicking the Brand Name in Middle of Header
	}
	

}
