package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Dazn_PartnerAccountPage_Docomo"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesforceOrg"
     )             
public class Dazn_PartnerAccountPage_Docomo {

	@LinkType()
	@FindBy(xpath = "//li[@class='helpLink']/a")
	public WebElement Dazn_PartnerAccountPage_Help_Link;
	
		@TextType()
	@FindBy(xpath = "//input[not(contains(@id,'en_')) and @name='LanguageGrp']//following::div[@class='radio-selector'][1]")
	public WebElement Dazn_myaccount_Page_Language_Non_English_Radio_Button;
	
		@TextType()
	@FindBy(xpath = "//input[contains(@value,'en_') and @name='LanguageGrp']/following::div[@class='radio-selector']")
	public WebElement Dazn_myaccountPage_Language_English_Radio;

		@LinkType()
		@FindBy(xpath = "//a[@class='backToHome']")
		public WebElement Dazn_PartnerAccountPage_Docomo;

		@LinkType()
		@FindBy(xpath = "//a[contains(@id,'SaveLanguageBtn')]")
		public WebElement Dazn_PartnerAccountPage_Docomo_Save_Lang;

		@LinkType()
		@FindBy(xpath = "//a[@onclick='ManageAccount()']")
		public WebElement Dazn_PartnerAccountPage_Docomo_To_d_menu;

		@LinkType()
		@FindBy(xpath = "//a[contains(@class,'cancelSub')]")
		public WebElement Dazn_PartnerAccountPage_Docomo_CancelSub;
		
	    @LinkType()
	    @FindBy(xpath = "//a[@id='changelang']")
	    public WebElement Dazn_helpPage_Langugae_link;
@LinkType()
	    @FindBy(xpath = "//li[contains(@class, \"redeemLink\")]//a")
	    public WebElement Dazn_PatnerAccountPage_Footer_Redeem_Link;
			
}
