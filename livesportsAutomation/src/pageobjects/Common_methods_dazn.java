package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.provar.core.testapi.annotations.*;

@Page(title = "Common_methods_dazn", connection = "DAZN")
public class Common_methods_dazn {
	WebDriver driver;
	
	public Common_methods_dazn(WebDriver driver)
 {
		this.driver = driver;
 }
 
	public void click_Link(String linkname) {
		WebDriverWait wait = new WebDriverWait(driver, 25);

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//a[text()='%s']", linkname))));
		element.click();
		//driver.findElement(By.xpath(String.format("//a[text()='%s']", linkname))).click();
 }
 
 	public void verify_Link_Exist(String linkname) {
		WebDriverWait wait = new WebDriverWait(driver, 25);

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//a[text()='%s']", linkname))));
		element.isDisplayed();
		////*[text()="CHANGE LANGUAGE"]
 }
 
  	public void verify_TextBox_ErrorMessage(String fieldlabel, String Errormsg) {
		WebDriverWait wait = new WebDriverWait(driver, 25);

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//span[text()='%s']/following::span[1][text()=\"%s\"]", fieldlabel,Errormsg))));
		element.isDisplayed();
		////span[text()='%s']/following::div[@class='Hint error'][1]/div/span[text()="%s"][1]
		////span[text()='%s']/following::span[1][text()=\"%s\"]
 }
  	public void verify_Text_Exist(String text) {
		WebDriverWait wait = new WebDriverWait(driver, 25);

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//*[text()=\"%s\"]", text))));
		element.isDisplayed();
		////*[text()="CHANGE LANGUAGE"]
 }
	
}
