package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.ChoiceListValue;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_remember_emailPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_remember_emailPage {

	@TextType()
	@FindBy(name = "firstName")
	public WebElement Dazn_remember_emailPage_First_Name;
	@TextType()
	@FindBy(xpath = "//input[contains(@name, 'lastName')]")
	public WebElement Dazn_remember_emailPage_Last_Name;
	@ChoiceListType(values = { @ChoiceListValue(value = "DirectDebit", title = "Direct debit"),
			@ChoiceListValue(value = "CreditCard", title = "Credit card"), @ChoiceListValue(value = "PayPal") })
	@FindBy(xpath = "//option[2]")
	public WebElement Dazn_remember_emailPage_Select_Payment_Method;
	@TextType()
	@FindBy(xpath = "//input[contains(@name, 'cardNumber')]")
	public WebElement Dazn_remember_emailPage_Last_4_digits_of_your_card;
	@ButtonType()
	@FindBy(xpath = "//span[contains(@class, 'wrapper')]")
	public WebElement Dazn_remember_emailPage_Last_4_digits_of_your_card_Get_Email;
			
}
