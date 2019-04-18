package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_PayPalPayment_LoginPage"                                
     , summary=""
     , relativeUrl=""
     , connection="daznmylogin"
     )             
public class Dazn_PayPalPayment_LoginPage {

	@TextType()
	@FindBy(xpath = "//*[@id=\"login\"]/div/div/header/p")
	public WebElement Dazn_PayPalPayment_LoginPage_PageValidate;
	@TextType()
	@FindBy(xpath = "//input[@type='email']")
	public WebElement Dazn_PaypalPayment_Email_textBox;
	@ButtonType()
	@FindBy(xpath = "//button[@id='btnNext']")
	public WebElement Dazn_payPalpayment_LoginPage_Next;
	@TextType()
	@FindBy(xpath = "//input[@type='password']")
	public WebElement Dazn_PayPalPayment_LoginPage_Password;
	@ButtonType()
	@FindBy(xpath = "//button[@id='btnLogin']")
	public WebElement Dazn_PayPalPayment_LoginPage_Login_Button;
	@ButtonType()
	@FindBy(xpath = "//div[@id='emailErrorMessage']")
	public WebElement Dazn_payPalpayment_LoginPage_Email_Error;
	@TextType()
	@FindBy(xpath = "//div[@id=\"content\"]/div[1]/p")
	public WebElement Dazn_PayPalPayment_LoginPage_Password_Error_message;
			
}
