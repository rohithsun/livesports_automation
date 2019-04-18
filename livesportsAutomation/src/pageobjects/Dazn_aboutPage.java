package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_aboutPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_aboutPage {

	@TextType()
	@FindBy(xpath = "//span[contains(@class, 'questCustom ng-binding')]")
	public WebElement Dazn_aboutPage_About_Lable;
			
}
