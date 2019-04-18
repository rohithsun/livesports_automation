package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Dazn_Portability_HelpPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_Portability_HelpPage {

	@TextType()
	@FindBy(xpath = "//span[contains(@ng-bind-html,'oSelectedArticle')]")
	public WebElement Dazn_Portability_HelpPage_Label;
			
}
