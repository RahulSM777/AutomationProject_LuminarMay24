package test_PKG;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import base_ClassPKG.FinalP_Base;
import excel_UtilityPKG.FinalP_ExcelUtility;
import webPage_PKG.FinalP_WebPage;

public class FinalP_DataDrivenTest extends FinalP_Base {

	@Test
	public void DataDrivenTest() throws IOException, InterruptedException
	{
		FinalP_WebPage ob=new FinalP_WebPage(Driver);
		
		String XL="C:\\Users\\rahul\\Desktop\\Testing\\4. Selenium\\Project - Automation\\DataDriven - Automation Project.xlsx";
		String Sheet="Sheet1";
		
		int rowCount=FinalP_ExcelUtility.getRowCount(XL, Sheet);
		
		ob.DataDrivenTest1();
		
		for(int i=1;i<=rowCount;i++)
		{
			Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
    			String Username= FinalP_ExcelUtility.getCellValues(XL, Sheet, i, 0);
    			System.out.println("Email: "+ Username);
			
    			String PassKey=FinalP_ExcelUtility.getCellValues(XL, Sheet, i, 1);
    			System.out.println("Password: "+ PassKey);
			
			ob.DataDrivenSetValues2(Username, PassKey);
			
			// LOGIN VERIFICATION
			
			String ExpectedURL="https://www.bewakoof.com/";
			if(Driver.getCurrentUrl().equals(ExpectedURL))
			{
				System.out.println("Login Successeful");
				System.out.println("CurrentURL: "+ Driver.getCurrentUrl());
			}
			else
			{
				System.out.println("Login Failed");
				System.out.println("CurrentURL: "+ Driver.getCurrentUrl());
			}
			
			ob.DataDrivenFieldClear();
		}
	}
	
	

}
