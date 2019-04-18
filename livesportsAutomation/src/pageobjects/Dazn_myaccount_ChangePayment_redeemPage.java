package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_myaccount_ChangePayment_redeemPage"                                
     , summary=""
     , relativeUrl=""
     , connection="daznmylogin"
     )             
public class Dazn_myaccount_ChangePayment_redeemPage {

	@TextType()
	@FindBy(xpath = "//input[@name='giftCode']")
	public WebElement Dazn_myaccount_ChangePayment_redeemPage_GiftCode_TextBox;
	@ButtonType()
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement Dazn_myaccount_ChangePayment_RedeemPage_Apply;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"RevealWrapper\")]//span")
	public WebElement Dazn_myaccount_ChangePayent_redeemPage_Error;
	@TextType()
	@FindBy(xpath = "//h1/div/p")
	public WebElement Dazn_myaccount_ChangePayment_redeemPage_EU_Errormessage;
	@TextType()
	@FindBy(xpath = "//form[contains(@class, \"content\")]/div[1]/p")
	public WebElement Dazn_myaccount_ChangePayment_redeemPage_Header;
			
}
