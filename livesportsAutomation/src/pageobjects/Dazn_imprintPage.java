package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_imprintPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_imprintPage {

	@TextType()
	@FindBy(xpath = "//span[contains(@class, 'questCustom ng-binding')]")
	public WebElement Dazn_imprintPage_about_Lable;
			
}
