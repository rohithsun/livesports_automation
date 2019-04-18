package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.Page;

@Page( title="Dazn_PayPalPayment_ReviewPage"                                
     , summary=""
     , relativeUrl=""
     , connection="daznmylogin"
     )             
public class Dazn_PayPalPayment_ReviewPage {

	@ButtonType()
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement Dazn_PayPalPayment_Reviewpage_Continue;
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class, \"btn\")]")
	public WebElement Dazn_PayPalPayment_Reviewpage_Continue_JP;
	@ButtonType()
	@FindBy(xpath = "//*[@id=\"button\"]//input")
	public WebElement Dazn_PayPalPayment_Reviewpage_AgreeAndContinue_JP;
			
}
