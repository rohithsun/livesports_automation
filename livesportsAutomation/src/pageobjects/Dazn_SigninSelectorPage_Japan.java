package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Dazn_SigninSelectorPage_Japan"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_SigninSelectorPage_Japan {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"buttonContainer\")]//button[1]")
	public WebElement Dazn_SigninSelectorPage_Japan_Dazn;
			
}
