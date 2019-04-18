package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="AccountPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class AccountPage {

	@LinkType()
	@FindBy(xpath = "//li[contains(@class, \"itemMyAccount\")]//a")
	public WebElement MyAccount;
	@TextType()
	@FindBy(xpath = "//span[text()='EMAIL ADDRESS']/../../div/input")
	public WebElement EmailAddress;
	@TextType()
	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement Password;
	@LinkType()
	@FindBy(xpath = "//input[@value='SIGN IN TO MY ACCOUNT']")
	public WebElement SignIN;
	@TextType()
	@FindBy(xpath = "(//div[contains(text(),'NAME')]/../following-sibling::div/div)[1]")
	public WebElement AccountName;
	@LinkType()
	@FindBy(xpath = "(//div[contains(text(),'EMAIL ADDRESS')]/../following-sibling::div/div)[1]")
	public WebElement EmailAdd;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Free trial ends:')]/following-sibling::span")
	public WebElement FreeTrialEndDate;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Subscription Price:')]/following-sibling::span")
	public WebElement SubscriptionPrice;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Next payment date:')]/following-sibling::span")
	public WebElement Nextpaymentdate;
	@TextType()
	@FindBy(xpath = "(//div[contains(text(),'PAYMENT METHOD')]/following-sibling::div)[1]")
	public WebElement PaymentMethodInformation;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"MenuButton\")]//span[1]")
	public WebElement Menu;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"wrapper\")]//input")
	public WebElement SIGN_IN_TO_MY_ACCOUNT;
	@LinkType()
	@FindBy(linkText = "CANCEL SUBSCRIPTION")
	public WebElement Verify_CANCELSUBSCRIPTION_Button;
	@LinkType()
	@FindBy(xpath = "//*[contains(@id,'frmMyAccount:ConfirmDevicesSignOut')]")
	public WebElement SIGN_OUT_FROM_ALL_DEVICES;
	@LinkType()
	@FindBy(xpath = "//*[contains(@id, 'frmMyAccount:idSaveLanguageBtn')]")
	public WebElement SAVE_LANGUAGE;
	@LinkType()
	@FindBy(xpath = "//*[contains(@id, 'frmMyAccount:ChangePassword')]")
	public WebElement ChangePassword_Link;
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class, \"ButtonBase\")]")
	public WebElement Start_Watching_Account_Page;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"backToHome\")]")
	public WebElement BACKTOHOME_Link;
	@FindBy(xpath = "//input[contains(@name, 'email')]")
	@TextType()
	public WebElement Email_Address_enter;
	@TextType()
	@FindBy(xpath = "//input[contains(@class, \"form-control\")]")
	public WebElement EmailAddress_dd;
	@TextType()
	@FindBy(id = "emailvalidation")
	public WebElement Invalid_Email_ErrorMsg;
	@TextType()
	@FindBy(id = "emailvalidation")
	public WebElement Invalid_EmailAdd_Error;
	@TextType()
	@FindBy(id = "emailPwdValidation")
	public WebElement Invalid_password_errormsg;
	@TextType()
	@FindBy(id = "emailvalidation")
	public WebElement Invalid_Email_ErrorMsg1;
	@TextType()
	@FindBy(xpath = "//a[contains(@href, 'paymenthistory')]")
	public WebElement Dazn_myaccountPage_Subscription_View_Payment_History;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"row\")]/div[1]/div[1]/div/div/input")
	public WebElement CurrentPassword;
	@TextType()
	@FindBy(xpath = "//span[contains(@class, \"wrapper\")]")
	public WebElement sTARTYOURFREEMONTH;
	@LinkType()
	@FindBy(xpath = "//p//a[text()=\"Sign in\"]")
	public WebElement signIn;
			
}
