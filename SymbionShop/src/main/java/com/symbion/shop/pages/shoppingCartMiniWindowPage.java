package com.symbion.shop.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.symbion.shop.util.TimeUtil;

public class shoppingCartMiniWindowPage extends ShopTestBase{
	
	@FindBy(id="ctl00_cplMain_btnViewShoppingCart")
	WebElement cartViewBtn;
	
				
	public shoppingCartMiniWindowPage() {
		PageFactory.initElements(driver, this);
	}
	
	public shoppingCartPage viewBtnClick() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(TimeUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(5000);
		cartViewBtn.click();
		Thread.sleep(5000);
		return new shoppingCartPage();
	}


}
