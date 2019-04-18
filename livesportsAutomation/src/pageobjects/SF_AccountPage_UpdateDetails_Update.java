package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;
import com.provar.core.testapi.annotations.VisualforceBy;

@SalesforcePage( title="SF_ Account Page_ Update Details_ Update"                                
               , summary=""
               , page="UpdateAccountAndUser"
               , namespacePrefix=""
               , object="Account"
               , connection="SalesforceOrg"
     )             
public class SF_AccountPage_UpdateDetails_Update {

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
	@FindBy(xpath = "//input[@type='submit' and contains(@value,'Save')]")
	public WebElement SF_AccountPage_UpdateDetails_Update_SaveButton;

	@ButtonType()
	@FindBy(xpath = "//table/tbody/tr[7]/td[1]/input")
	public WebElement SF_AccountPage_UpdateDetails_Email_Preference;
       
	
}
