package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.PageWait;
import com.provar.core.testapi.annotations.PageWaitAfter;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_myloginPage"                                
     , summary=""
     , relativeUrl=""
     , connection="daznmylogin"
     )             
public class Dazn_myloginPage {

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@TextType()
	@FindBy(xpath = "//input[contains(@class, \"form-control\")]")
	public WebElement Dazn_myloginPage_Email_Address_Button;
	@FindBy(id = "idEmailPwd")
	@TextType()
	public WebElement Dazn_myloginPage_Password;
	@LinkType()
	@FindBy(xpath = "//input[contains(@id, 'Mylogin:btnLogin')]")
	public WebElement Dazn_myloginPage_Sign_In_to_My_Account_Button;
	@LinkType()
	@FindBy(linkText = "DAZN")
	public WebElement Dazn_myloginPage_Sign_In_to_My_Account_DAZN_Button;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"wrapper\")]//input")
	public WebElement Dazn_myloginPage_Sign_In_to_My_Account_Button1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"buttonContainer\")]//button[1]")
	public WebElement Dazn_myloginPage_Sign_In_DAZN_Button;
	@ButtonType()
	@FindBy(xpath = "//button[1]//span[2]")
	public WebElement Dazn_myloginPage_Sign_In_DAZN;
	@LinkType()
	@FindBy(xpath = "//li[@class='helpLink']/a")
	public WebElement Dazn_myloginPage_Help_Link;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"submit\")]/button/span[2]")
	public WebElement Dazn_myloginPage_StartWatching_popup_US;
			
}
