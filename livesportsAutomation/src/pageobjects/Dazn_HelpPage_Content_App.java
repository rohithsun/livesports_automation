package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Dazn_HelpPage_Content_App"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_HelpPage_Content_App {

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'ng-binding')]")
	public WebElement Dazn_HelpPage_Content_App_Label;
	@LinkType()
	@FindBy(xpath = "//a[@class=\"navHelp\"]")
	public WebElement Dazn_HelpPage_Content_App_Help_Label;
	@TextType()
	@FindBy(xpath = "//span[@class='questCustom ng-binding']")
	public WebElement Dazn_HelpPage_Content_App_Article_Label;
	
			
}
