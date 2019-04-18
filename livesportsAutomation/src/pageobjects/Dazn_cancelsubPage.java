package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_cancelsubPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_cancelsubPage {

	//Click Drop Down
	@TextType()
	@FindBy(xpath = "//span[contains(@class, \"label-text\")]")
	public WebElement Dazn_cancelsubPage_Tell_Us_why_you_are_leaving;
	@TextType()
	@FindBy(xpath = "//textarea[contains(@class, 'custTextarea')]")
	public WebElement Dazn_cancelsubPage_Describe_Your_Issue;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id, 'KeepSubscriptionBtn')]")
	public WebElement Dazn_cancelsubPage_Keep_Subscription_Link;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id, 'CancelSubscriptionBtn')]")
	public WebElement Dazn_cancelsubPage_Confirm_Cancellation;
	@TextType()
	@FindBy(xpath = "//li[1]//div")
	public WebElement Dazn_cancelsubPage_Tell_Us_why_you_are_leaving_Option;
	@TextType()
	@FindBy(xpath = "//ul[@id='ddMenu']/li[1]/div")
	public WebElement Dazn_cancelsubPage_Tell_Us_why_you_are_leaving_Value;
}
