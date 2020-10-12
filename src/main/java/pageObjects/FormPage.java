package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormPage {
	public FormPage(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	public WebElement nameField;
	
	
	@AndroidFindBy(xpath="//*[@text='Female']")
	public WebElement femaleOption;
	// driver.findElement(By.id("android:id/text1")).click();
	
	@AndroidFindBy(id="android:id/text1")
	public WebElement countrySelection;
	
	
	@AndroidFindBy(xpath="//*[@text='Argentina']")
	public WebElement countryName;
	
	
	
    /*driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
    driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();*/
	 
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	public WebElement letsShopBtn;
	
	

	
	//driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	

	
	
	
	
	

	@AndroidFindBy(id = "com.androidsample.generalstore:id/productPrice")

	public List<WebElement> ProductList;
	
	
	@AndroidFindBy(xpath = "//*[@text='ADD TO CART']")

	public List<WebElement> firstProduct;
	
	
	@AndroidFindBy(xpath = "//*[@text='ADD TO CART']")

	public List<WebElement> secondProduct;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
	public WebElement cartButton;

	
	
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/productPrice")

	public List<WebElement> firstProductPrice;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/productPrice")

	public List<WebElement> secondProductPrice;
	
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/totalAmountLbl")

	public WebElement totalProductPrice;
	
	
	
	
	
}
