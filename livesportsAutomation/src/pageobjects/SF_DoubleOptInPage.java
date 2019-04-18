package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.VisualforceBy;

@SalesforcePage( title="SF_DoubleOptInPage"                                
               , page="DoubleOptIn"
               , object="Account"
               , connection="SalesforceOrg"
     )             
public class SF_DoubleOptInPage {

	@LinkType()
	@FindBy(xpath = "//a[contains(@id, 'fDoubleOptIn:btnStartWatching')]")
	public WebElement SF_DoubleOptInPage_StartWatching_Btn;
	
}
