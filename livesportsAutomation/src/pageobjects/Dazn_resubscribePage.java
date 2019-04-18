package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_resubscribePage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_resubscribePage {

	@TextType()
	@FindBy(xpath = "//label")
	public WebElement Dazn_resubscribePage_Reactivate_Subscription;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"labelTxt\")]")
	public WebElement PaymentMethod;
	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'resubscribeFrm:j_id32')]/p")
	public WebElement PaymentMethodValue;
	@LinkType()
	@FindBy(xpath = "//span[contains(@id, 'resubscribeFrm:j_id42')]")
	public WebElement Dazn_resubscribePage_Reactivate_Subscription_No_Thanks;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id, 'resubscribeFrm:idReactivateMemberBtn')]")
	public WebElement Dazn_resubscribePage_Reactivate_Subscription_Subscribe;
			
}
