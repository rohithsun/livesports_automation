package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_PayPalPayment_CheckOutPage"                                
     , summary=""
     , relativeUrl=""
     , connection="daznmylogin"
     )             
public class Dazn_PayPalPayment_CheckOutPage {

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"prop-img\")]")
	public WebElement Dazn_PayPalPayment_CheckOut_Page__Validation;
	@TextType()
	@FindBy(xpath = "//span[text()='Rabobank Nederland']")
	public WebElement Dazn_PayPalPayment_CheckOutPage_Way_to_Pay;
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class, \"btn\")]")
	public WebElement Dazn_PayPalPayment_CheckOutPage_Continue_Button;
			
}
