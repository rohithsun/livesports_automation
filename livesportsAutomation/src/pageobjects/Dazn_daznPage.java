package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.PageWait;
import com.provar.core.testapi.annotations.PageWaitAfter;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_daznPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_daznPage {

	@LinkType()
	@FindBy(xpath = "//a[contains(@href, 'privacy')]")
	public WebElement Dazn_daznPage_Privacy_Policy_FooterModuleLinks_Link;
	@LinkType()
	@FindBy(xpath = "//a[contains(@href, 'terms')]")
	public WebElement Dazn_daznPage_Terms_of_Use_FooterModuleLinks_Link1;
	@LinkType()
	@FindBy(xpath = "//a[contains(@href, 'FAQ')]")
	public WebElement Dazn_daznPage_FAQ_FooterModuleLinks_Link1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'FooterModuleLinks')]/ul/li[1]/a")
	public WebElement Dazn_daznPage_HELP_FooterModuleLinks_Link1;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"redeemLink\")]")
	public WebElement Dazn_daznPage_Redeem_FooterModuleLinks_Link;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'FooterModuleLinks')]/ul/li[6]/a")
	public WebElement Dazn_daznPage_About_FooterModuleLinks_Link;
	@LinkType()
	@FindBy(xpath = "//a[text() = 'Media']")
	public WebElement Dazn_daznPage_Media_FooterModuleLinks_Link;
	@TextType()
	@FindBy(xpath = "//p[text()='DAZN™']")
	public WebElement Dazn_daznPage_DAZNTM_FooterModuleLinks_Label1;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 60)
	@LinkType()
	@FindBy(xpath = "//a[contains(@href, 'signin')]")
	public WebElement Dazn_daznPage_Sign_in_Link1;
	@TextType()
	@FindBy(xpath = "//li[contains(@class, 'LanguageLink')]/span[text()='English']")
	public WebElement Dazn_daznPage_English_LanguageLink_Link1;
	@TextType()
	@FindBy(xpath = "//li[contains(@class, 'LanguageLink')]/span[text()='Deutsch']")
	public WebElement Dazn_daznPage_Deutsch_LanguageLink_Link1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'RichTextBase RichText message')]/p/a")
	public WebElement Dazn_daznPage_PrivacyPolicy_and_Cookie_Notice_CookieBanner_Link;
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class, 'ButtonBase Button primary')]/span[2]")
	public WebElement Dazn_daznPage_Close_CookieBanner_Button11;
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class, 'ButtonBase Button start chevron')]/span[contains(@class, 'wrapper')]")
	public WebElement Dazn_daznPage_Start_Your_Free_Month_Now_Button;
	@LinkType()
	@FindBy(xpath = "//li[1]//a")
	public WebElement help;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"offers\")]/div[1]/button")
	public WebElement DaznPage_AnnualSub_Select_Button_US;
	@ButtonType()
	@FindByLabel(label = "SELECT")
	public WebElement Dazn_daznPage_MontlySubscription;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'OfferSelection')][2]/button")
	public WebElement Dazn_daznPage_MontlySubscription_CA;
	@ButtonType()
	@FindBy(xpath = "//*[contains(@id,'root')]/div/div[2]/div[2]/div[2]/a/span")
	public WebElement Dazn_daznPage_Start_Your_Free_Month_Now_Button_CA;
	@LinkType()
	@FindBy(linkText = "DAZN")
	public WebElement Dazn_myloginPage_Sign_In_to_My_Account_DAZN_Button;
	
		
}
