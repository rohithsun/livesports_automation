package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_mediaPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_mediaPage {

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"container--full-width\")]/div/section/div[1]/h1")
	public WebElement Dazn_mediaPage_Welcome_to_the_DAZN_Media_Centre_Assert;
			
}
