package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Dazn_CancelSubscription_Docomo"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesforceOrg"
     )             
public class Dazn_CancelSubscription_Docomo {

	@ButtonType()
	@FindBy(xpath = "//input[@type='submit' and @name='subForm']")
	public WebElement Dazn_CancelSubscription_Docomo;
			
}
