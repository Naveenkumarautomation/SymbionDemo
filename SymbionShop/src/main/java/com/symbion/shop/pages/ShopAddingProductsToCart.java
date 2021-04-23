package com.symbion.shop.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopAddingProductsToCart extends ShopTestBase{
	
	@FindBy(name="ctl00$cplMain$rptProduct$ctl01$txtOrderQuantity")
	WebElement productQty1;
	
	@FindBy(name="ctl00$cplMain$rptProduct$ctl03$txtOrderQuantity")
	WebElement productQty2;
	
	@FindBy(id="btnAddToCart")
	WebElement addToCartBtn;
		
	public ShopAddingProductsToCart() {
		PageFactory.initElements(driver, this);
	}
	
	public shoppingCartMiniWindowPage addProductsToCart() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(250,0)");
	    Thread.sleep(2000);
	    productQty1.sendKeys("5");
		Thread.sleep(2000);
		productQty2.sendKeys("2");
		Thread.sleep(2000);
		addToCartBtn.click();
		Thread.sleep(2000);
		return new shoppingCartMiniWindowPage();
	}


}
