
package test_Book.POM;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import test_Book.BaseClass;

 
public class TC_004_GiftCard extends BaseClass {
	
	WebDriver driver;
	
	//Constructor
	public TC_004_GiftCard(WebDriver driver)
	{
		this.driver=driver;
	}
	

	//Locators

	By giftcart = By.xpath("//*[@id='header']/section/div/ul[2]/li[3]/a");
	By bday = By.xpath("//section[@class='_14QEd']//li[3]");
	
	
	//Action
	public void GiftCard() throws InterruptedException, IOException {
		Thread.sleep(2000);
		driver.findElement(giftcart).click();
//		driver.findElement(By.xpath("//*[@id='header']/section/div/ul[2]/li[3]/a")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);
//		bday.click();
		driver.findElement(bday).click();
		Thread.sleep(2000);
		   
	}
	
}
