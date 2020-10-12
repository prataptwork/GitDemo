package practise.AppiumFramework;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.CheckoutPage;
import pageObjects.FormPage;




public  class Ecommerce_tc_4 extends base{

	
	@Test
	public void totalValidation() throws IOException, InterruptedException
	{

		service=startServer();
		AndroidDriver<AndroidElement> driver=capabilities("GeneralStoreApp");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     FormPage formPage=new FormPage(driver);
	     
	     
	     
	     formPage.nameField.sendKeys("Pratap");
	     
	     
	     
	     
	     
	     
	     
	     driver.hideKeyboard();
	     formPage.femaleOption.click();
	     formPage.countrySelection.click();
	     Utilities u=new Utilities(driver);
	     u.scrollToText("Argentina");
	     //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
	  //   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));     
	     
	     formPage.countryName.click();
	     
	     
	     formPage.letsShopBtn.click();
	    
	    

	     formPage.firstProduct.get(0).click();
	     formPage.secondProduct.get(0).click();
	     formPage.cartButton.click();
		Thread.sleep(5000);
		
	     
	     
	     String Amount1=formPage.firstProductPrice.get(0).getText();
	   //remove $ icon by using substring, start from 0 index
			Amount1=Amount1.substring(1);
			
			//convert string into double
			double amount1value= Double.parseDouble(Amount1);
			
			//Print value
			
			System.out.println(amount1value);
			
			
	     
	   String Amount2=  formPage.secondProductPrice.get(1).getText();
	   
	   Amount2= Amount2.substring(1);
		double amount2value= Double.parseDouble(Amount2);
		System.out.println(amount2value);
	    
		
		//Sum of both products amount1value + amount2value
		
				double sumOfProducts=amount1value+amount2value;
				System.out.println(sumOfProducts  + "sum of products");	
				
				
				String total = formPage.totalProductPrice.getText();
				
				
				total=total.substring(1);
				
				double totalAmount = Double.parseDouble(total);
				System.out.println(totalAmount  +  " Total amount for produts");
				
				
				
service.stop();




	}
	
	@BeforeTest
	public void killAllNodes() throws IOException, InterruptedException
	{
	//taskkill /F /IM node.exe
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
		
	}
	
	
}
