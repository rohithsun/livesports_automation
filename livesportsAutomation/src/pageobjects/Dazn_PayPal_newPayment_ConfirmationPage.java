package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.Page;

@Page( title="Dazn_PayPal_newPayment_ConfirmationPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_PayPal_newPayment_ConfirmationPage {

	@ButtonType()
	@FindBy(xpath = "//button[contains(@class,'ButtonBase Button')]")
	public WebElement Dazn_PayPal_newPayment_confirmation_startWatching_Button;
			
}
