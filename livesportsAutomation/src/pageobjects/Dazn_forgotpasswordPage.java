package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.PageWait;
import com.provar.core.testapi.annotations.PageWaitAfter;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_forgotpasswordPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_forgotpasswordPage {

	@TextType()
	@FindBy(xpath = "//input[contains(@name, 'email')]")
	public WebElement Dazn_forgotpasswordPage_Email_Address_Textbox;
	@LinkType()
	@FindBy(xpath = "//a[contains(@href,'remember-email')]")
	public WebElement Dazn_forgot_passwordPage_Forgot_Email_address_Link;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class, 'SubmitButton')]/span[@class= 'wrapper']") 
	public WebElement Dazn_forgot_passwordPage_Send_Button;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'PasswordResetResultView')]/h1")
	public WebElement Dazn_forgotpasswordPage_Passwordreset_Assert;
			
}
