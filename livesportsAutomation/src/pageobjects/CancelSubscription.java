package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.ChoiceListValue;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;
import com.provar.core.testapi.annotations.VisualforceBy;

@SalesforcePage( title="Cancel Subscription"                                
               , summary=""
               , page="CancelSubscription"
               , namespacePrefix=""
               , object="Account"
               , connection="SalesforceOrg"
     )             
public class CancelSubscription {

	@BooleanType()
	@VisualforceBy(componentXPath = "apex:selectOption[1]")
	public WebElement SF_Immediate_Check;
	@ChoiceListType(values = { @ChoiceListValue(value = "NONE"), @ChoiceListValue(value = "R-0539", title = "Sport/event unavailable or season over"), @ChoiceListValue(value = "R-0540", title = "Incompatible Devices"), @ChoiceListValue(value = "R-0541", title = "Competitor signup"), @ChoiceListValue(value = "R-0542", title = "Too expensive"), @ChoiceListValue(value = "R-0543", title = "No time to watch / internet too slow"), @ChoiceListValue(value = "R-0544", title = "Doesn’t like UI"), @ChoiceListValue(value = "R-0545", title = "Doesn’t like the commentating"), @ChoiceListValue(value = "R-0546", title = "Poor video/audio/framerate quality"), @ChoiceListValue(value = "R-0547", title = "Buffering or lagged streaming"), @ChoiceListValue(value = "R-0548", title = "Playback fails / App tech issue"), @ChoiceListValue(value = "R-0549", title = "Unable to log-in, can’t stream"), @ChoiceListValue(value = "R-0550", title = "Double account (dual sign-up)") })
	@VisualforceBy(componentXPath = "apex:pageBlock[not(@id)]/apex:outputPanel[not(@id)]//select")
	public WebElement SF_ReasonForCancellation;
	@ButtonType()
	@FindBy(xpath = "//input[contains(@class, \"btn\")]")
	public WebElement SF_Cancel_Submit;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"messageText\")]")
	public WebElement SF_Cancellation_SuccessMsg;
	
}
