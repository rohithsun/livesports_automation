package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_help_faqPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_help_faqPage {

	@TextType()
	@FindBy(xpath = "//span[contains(@class,'currentBCPiece ng-binding')]")
	public WebElement Dazn_help_faqPage__FAQ_Lable;
	@LinkType()
	@FindBy(xpath = "//span[contains(@class, \"contactusLink\")]")
	public WebElement Danz_helpPage_ContactUs_Link;
			
}
