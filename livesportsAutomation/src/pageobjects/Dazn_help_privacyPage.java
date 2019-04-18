package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_help_privacyPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_help_privacyPage {

	@TextType()
	@FindBy(xpath = "//span[contains(@class, 'questCustom ng-binding')]")
	public WebElement Dazn_help_privacyPage_Privacy__Lable;
			
}
