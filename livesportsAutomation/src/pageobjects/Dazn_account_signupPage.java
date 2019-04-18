package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.PageWait;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_account_signupPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_account_signupPage {

	@TextType()
	@FindBy(xpath = "//input[@name=\"firstName\"]")
	public WebElement Dazn_account_signupPage_First_name_Textbox;
	@TextType()
	@FindBy(xpath = "//input[@name=\"lastName\"]")
	public WebElement Dazn_account_signupPage_Last_name_Textbox;
	@TextType()
	@FindBy(xpath = "//input[@name=\"email\"]")
	public WebElement Dazn_account_signupPage_Email_Textbox;
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement Dazn_account_signupPage_Create_a_Password_Textbox;
	@TextType()
	@FindBy(xpath = "//input[@name=\"repeatPassword\"]")
	public WebElement Dazn_account_signupPage_Re_Enter_Password_Textbox;
	/*@ButtonType()
	@FindByLabel(label = "Continue")
	public WebElement continue_button;*/
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"submit\")]//button")
	public WebElement Dazn_account_SignupPage_Visbleforallusers_Ok_Button_US;
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class, \"ButtonBase\")]")
	public WebElement Dazn_account_signup_continue_button;
}
