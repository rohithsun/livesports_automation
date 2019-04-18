package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;

@Page( title="Dazn_keepintouchinitiatePage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_keepintouchinitiatePage {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'pauseBtn')]/span/a")
	public WebElement Dazn_keepintouchinitiatePage_Yes;
	@LinkType()
	@FindBy(linkText = "NO, I DON'T WANT TO KEEP IN TOUCH.")
	public WebElement Dazn_keepintouchinitiatePage_No;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class,\"okBtn\")]")
	public WebElement Dazn_keepintouchinitiatePage_oK;
			
}
