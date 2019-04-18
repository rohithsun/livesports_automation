package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.PageWait;
import com.provar.core.testapi.annotations.TextType;

@Page( title="demo_kt_page"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class demo_kt_page {

	@TextType()
	@FindBy(xpath = "//input[@name=\"email\"]")
	public WebElement daznpage_emailadd;
	@TextType()
	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement danz_password;
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class, \"ButtonBase\")]")
	public WebElement sTARTWATCHING;
	@TextType()
	@FindBy(xpath = "//span[contains(@class, \"wrapper\")]")
	public WebElement startYourFreeMonthNow;
	@TextType()
	@FindBy(xpath = "//input[contains(@class, \"form-control\")]")
	public WebElement idemail121;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"j_id0:fMylogin:j_id49\"]//a")
	public WebElement signin;
	@PageWait.Timed(durationSeconds = 10)
	@LinkType()
	@FindBy(linkText = "OK")
	public WebElement cookieoK;
	@ButtonType()
	@FindBy(xpath = "//a[contains(@class, \"wrapper\")]//input")
	public WebElement sIGNINTOMYACCOUNT;
	@TextType()
	@FindBy(xpath = "//input[contains(@class, \"form-control\")]")
	public WebElement idemail1211;
	@TextType()
	@FindBy(id = "emailvalidation")
	public WebElement idemailerrmsg;
	@TextType()
	@FindBy(id = "userNavLabel")
	public WebElement UserMenu;
	@LinkType()
	@FindBy(linkText = "Developer Console")
	public WebElement developerConsole;
	@ButtonType()
	@FindByLabel(label = "Debug")
	public WebElement debug;
			
}
