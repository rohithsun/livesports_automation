package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.PageWait;
import com.provar.core.testapi.annotations.PageWaitAfter;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_account_signinPage"                                
, summary=""
, relativeUrl=""
, connection="DAZN"
		)             
public class Dazn_account_signinPage {

	@TextType()
	@FindBy(xpath = "//input[contains(@name, 'email')]")
	public WebElement Dazn_account_signinPage_Email_Address;
	@TextType()
	@FindBy(xpath = "//input[contains(@name, 'password')]")
	public WebElement Dazn_account_signinPage_Password;
	@ButtonType()
	@FindBy(xpath = "//input[contains(@id, 'fMylogin:btnLogin')]")
	public WebElement Dazn_account_signinPage_START_WATCHING_Button;
	@LinkType()
	@FindBy(xpath = "//a[contains(@href,'forgot-password')]")
	public WebElement Dazn_account_signinPage_Forgot_your_Password__Link;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'ErrorView E10049')]")
	public WebElement Dazn_account_SignInPage_ErrorMessage;

	@ButtonType()
	@FindBy(xpath = "//div[@class='submit primary']/button") //*[@id="myAlert"]/div/div/a
	public WebElement Dazn_account_signinPage_ErrorMessage_Ok_Button_DE; 
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'primary')]/a") //*[@id="myAlert"]/div/div/a
	public WebElement Dazn_account_signinPage_ErrorMessage_Ok_Button;
	@ButtonType()
	@FindBy(xpath = "//*[@class=\"wrapper\"]")
	public WebElement Dazn_account_signinPage_Japan_START_WATCHING_Button;
	@PageWait.Field(timeoutSeconds = 10)
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class, \"ButtonBase\")]")
	public WebElement Dazn_account_signinPage_Japan_START_WATCHING_Button1;
	
}
