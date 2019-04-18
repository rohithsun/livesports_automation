package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_PayPalPayment"                                
     , summary=""
     , relativeUrl=""
     , connection="daznmylogin"
     )             
public class Dazn_PayPalPayment_doubts {

	@TextType()
	@FindBy(xpath = "//input[@type='email']")
	public WebElement Dazn_PayPalPayment_Email_TextBox;
	@TextType()
	@FindBy(xpath = "//*[@id=\"login\"]/div/div/header/p")
	public WebElement Dazn_PayPalPayment_Page_validation;
	@ButtonType()
	@FindBy(xpath = "//button[@id='btnNext']")
	public WebElement Dazn_PayPalPayment_Next_Button;
	@TextType()
	@FindBy(xpath = "//input[@type='password']")
	public WebElement Dazn_PayPalPayment_Password;
	@ButtonType()
	@FindBy(xpath = "//button[@id='btnLogin']")
	public WebElement Dazn_PayPalPayment_Login;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"prop-img\")]")
	public WebElement Dazn_PayPalPayment_choose_a_way_Validation;
	@TextType()
	@FindBy(xpath = "//span[text()='Rabobank Nederland']")
	public WebElement Dazn_PayPalPayment_Choose_a_way_Radio_Button;
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class, \"btn\")]")
	public WebElement Dazn_PayPalPayment_Choose_a_way_Continue_button;
	@ButtonType()
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement Dazn_PayPalPayment_Pay_With_Submit_button;
	@LinkType()
	@FindBy(xpath = "//a[@id='cancelLink' and @class='btn full']")
	public WebElement Dazn_PayPalPayment_returnToMerchant_Button;
			
}
