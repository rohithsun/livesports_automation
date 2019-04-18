package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="DAZN_ThanksPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class DAZN_ThanksPage {

	@TextType()
	@FindBy(xpath = "//h1")
	public WebElement DAZN_ThanksPage_THANKS_;
			
}
