package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_redeemPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_redeemPage {

	@TextType()
	@FindBy(xpath = "//form[contains(@class, 'content')]/div[1]/p")
	public WebElement Dazn_redeemPage_ENTER_YOUR_GIFT_CODE_Lable;
	@TextType()
	@FindBy(xpath = "//input[@name='giftCode']")
	public WebElement Dazn_redeemPage_GIFT_CODE_textbox;
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class,'redeem')]")
	public WebElement Dazn_redeemPage_Apply_Button;
	
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'RedeemErrorView')]/div[@class=\"RichTextBase RichText header\"]")
	public WebElement Dazn_redeemPage_No_RedeemErrorView_Message_Assert;
	
			@ButtonType()
	@FindBy(xpath = "//button[@type= 'submit']")
	public WebElement Dazn_redeemPage_AddGiftCode_Button; 
}
