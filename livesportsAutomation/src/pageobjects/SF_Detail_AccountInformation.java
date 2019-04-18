package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.PageWaitAfter;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;

@SalesforcePage( title="SF_ Detail_ Account Information"                                
               , summary=""
               , connection="SalesforceOrg"
               , object=""
     )             
public class SF_Detail_AccountInformation {
	@FindBy(xpath = "//form[contains(@action,'NextCharge')][text()]")
	@TextType()
	public WebElement SF_Account_Info_NextChargeDate;
	@PageWaitAfter.Timed(durationSeconds = 10)
	@ButtonType()
	@FindByLabel(label = "View profile")
	public WebElement viewProfile;
	@LinkType()
	@FindBy(linkText = "Switch to Salesforce Classic")
	public WebElement switchToSalesforceClassic;
}
