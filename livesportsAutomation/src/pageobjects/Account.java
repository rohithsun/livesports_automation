package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;
import com.provar.core.testapi.annotations.VisualforceBy;

@SalesforcePage( title="Account"                                
, summary=""
, page="Account"
, namespacePrefix=""
, object="Account"
, connection="SalesforceOrg"
		)             
public class Account {
	@LinkType()
	@FindBy(linkText = "Logout")
	public WebElement Logout;
	@TextType()
	@FindBy(xpath = "//h2[contains(@class, \"pageDescription\")]")
	public WebElement Verify_AccountPage_Header;
	@TextType()
	@FindBy(xpath = "//table/tbody/tr[1]/td[1]/input")
	public WebElement SF_AccountPage_UpdateDetails_Update_FirstName;
	@TextType()
	@FindBy(xpath = "//table/tbody/tr[2]/td[1]/input")
	public WebElement SF_AccountPage_UpdateDetails_Update_Lastname;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!SaveRecord}']")
	public WebElement SF_AccountPage_UpdateDetails_Update_SaveButton1;
	@TextType()
	@FindBy(xpath = "//table/tbody/tr[3]/td[1]/input")
	public WebElement SF_AccountPage_UserDetails_UpdateEmail;
	@ButtonType()
	@FindBy(xpath = "//*[contains(@id,'frmMyAccount:idSaveEmailPrefBtn')]")
	public WebElement SF_AccountPage_UpdateDetails_Update_SaveButton;
	@ButtonType()
	@FindBy(xpath = "//table/tbody/tr[7]/td[1]/input")
	public WebElement SF_AccountPage_UpdateDetails_Email_Preference;
	
	@LinkType()
	@FindBy(xpath = "//*[@id=\"setupLink\"]")
	public WebElement setup;
	@TextType()
	@FindBy(xpath = "//input[@name=\"setupSearch\"]")
	public WebElement quickFind;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"CustomSettings_font\"]")
	public WebElement customSettings;
	@LinkType()
	@FindBy(linkText = "DAZN Communicator Config")
	public WebElement dAZNCommunicatorConfig;	
	@LinkType()
	@FindBy(linkText = "Scheduled Jobs")
	public WebElement Scheduled_Jobs;
}
