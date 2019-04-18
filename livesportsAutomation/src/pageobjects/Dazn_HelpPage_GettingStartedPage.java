package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Dazn_HelpPage_GettingStartedPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_HelpPage_GettingStartedPage {

	@TextType()
	@FindBy(xpath = "//span[@class='questCustom ng-binding']")
	public WebElement Dazn_HelpPage_GettingStartedPage_Article_Label;
	@LinkType()
	@FindBy(xpath = "//a[@class=\"navHelp\"]")
	public WebElement Dazn_HelpPage_GettingStartedPage_HelpLink;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'ng-binding')]")
	public WebElement Dazn_HelpPage_GettingStartedPage;
			
}
