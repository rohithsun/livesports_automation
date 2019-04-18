package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Dazn_HelpPage_TroubleshootingPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_HelpPage_TroubleshootingPage {

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'ng-binding')]")
	public WebElement Dazn_HelpPage_TroubleshootingPage_Label;
	@LinkType()
	@FindBy(xpath = "//a[@class=\"navHelp\"]")
	public WebElement Dazn_HelpPage_TroubleshootingPage_Help_Label;
	@TextType()
	@FindBy(xpath = "//span[@class='questCustom ng-binding']")
	public WebElement Dazn_HelpPage_TroubleshootingPage_Article_Label;
}
