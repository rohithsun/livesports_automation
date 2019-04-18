package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_account_confirmPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_account_confirmPage {

	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"billingDates\")]//p[1]")
	public WebElement Dazn_account_confirmPage_Access_starts__Assert;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"billingDates\")]//p[2]")
	public WebElement Dazn_account_confirmPage_Free_trial_end_date__Assert;
	@TextType()
	@FindBy(xpath = "//p[3]")
	public WebElement Dazn_account_confirmPage_First_payment_date__Assert;
	@TextType()
	@FindBy(xpath = "//p[4]")
	public WebElement Dazn_account_confirmPage_Price__Assert;
	@TextType()
	@FindBy(xpath = "//p[5]")
	public WebElement Dazn_account_confirmPage_Payment_method__Assert;
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class, \"ButtonBase\")]")
	public WebElement Dazn_account_confirmPage_Start_watching_Button;
			
}
