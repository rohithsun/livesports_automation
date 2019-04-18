package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.ChoiceListValue;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_newuserpaymentPage"                                
, summary=""
, relativeUrl=""
, connection="DAZN"
		)             
public class Dazn_newuserpaymentPage {

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'AccordionSection DirectDebit PaymentAccordionSection')]/div/div[1]")
	public WebElement Dazn_newuserpaymentPage_Direct_Debit_Click;
	@TextType()
	@FindBy(xpath = "//input[@name=\"name\"]")
	public WebElement Dazn_newuserpaymentPage_Direct_Debit_Account_name_Textbox;
	@TextType()
	@FindBy(xpath = "//input[@name=\"iban\"]")
	public WebElement Dazn_newuserpaymentPage_Direct_Debit_IBAN_Textbox;
	@TextType()
	@FindBy(xpath = "//form[contains(@class, \"DirectDebitFormView\")]/div[2]/div/div[1]/div[1]")
	public WebElement Dazn_newuserpaymentPage_Direct_Debit_I_agree_to_the_Terms_of_Use_Checkbox;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'AccordionSection CreditCard PaymentAccordionSection')]/div/div[1]")
	public WebElement Dazn_newuserpaymentPage_Credit___Debit_Card_Click;
	@TextType()
	@FindBy(xpath = "//input[contains(@name, 'cardNumber')]")
	public WebElement Dazn_newuserpaymentPage_Credit___Debit_Card_CARD_NUMBER_Textbox;
	@ChoiceListType(values = { @ChoiceListValue(value = "0", title = "Month"),
			@ChoiceListValue(value = "1", title = "01"), @ChoiceListValue(value = "2", title = "02"),
			@ChoiceListValue(value = "3", title = "03"), @ChoiceListValue(value = "4", title = "04"),
			@ChoiceListValue(value = "5", title = "05"), @ChoiceListValue(value = "6", title = "06"),
			@ChoiceListValue(value = "7", title = "07"), @ChoiceListValue(value = "8", title = "08"),
			@ChoiceListValue(value = "9", title = "09"), @ChoiceListValue(value = "10"), @ChoiceListValue(value = "11"),
			@ChoiceListValue(value = "12") })
	@FindBy(xpath = "//fieldset/div[1]/div[2]/select")
	public WebElement Dazn_newuserpaymentPage_Credit___Debit_Card_EXPIRY_DATE_Month_Dropdown;
	@ChoiceListType(values = { @ChoiceListValue(value = "0", title = "Year"), @ChoiceListValue(value = "2018"),
			@ChoiceListValue(value = "2019"), @ChoiceListValue(value = "2020"), @ChoiceListValue(value = "2021"),
			@ChoiceListValue(value = "2022"), @ChoiceListValue(value = "2023"), @ChoiceListValue(value = "2024"),
			@ChoiceListValue(value = "2025"), @ChoiceListValue(value = "2026"), @ChoiceListValue(value = "2027") })
	@FindBy(xpath = "//fieldset/div[2]/div[2]/select")
	public WebElement Dazn_newuserpaymentPage_Credit___Debit_Card_Expiry_Year_Year_Dropdown;
	@TextType()
	@FindBy(xpath = "//input[@name=\"securityCode\"]")
	public WebElement Dazn_newuserpaymentPage_Credit___Debit_Card_CVV_Textbox;
	@TextType()
	@FindBy(xpath = "//form[contains(@class, \"CreditCardFormView\")]/div[4]/div/div[1]/div[1]")
	public WebElement Dazn_newuserpaymentPage_Credit___Debit_Card_I_agree_to_the_Terms_of_Use_Checkbox;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"Accordion\")]/div[3]/div[1]")
	public WebElement Dazn_newuserpaymentPage_PayPal_Click;
	@TextType()
	@FindBy(xpath = "//form[contains(@class, \"PayPalFormView\")]/div[2]/div/div[1]/div[1]")
	public WebElement Dazn_account_newuserpaymentPage_Paypal_I_agree_to_the_Terms_of_Use_Checkbox;
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class, 'subscribeButton centerBtn')]/span[2]")
	public WebElement Dazn_newuserpaymentPage_PayPal_Continue_To_PayPal_Button;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'AccordionSection GiftCode GiftCodeAccordionSection')]/div/div[1]")
	public WebElement Dazn_account_newuserpaymentPage_Gift_Code_Arrow_Icon;
	@TextType()
	@FindBy(xpath = "//input[@name=\"giftCode\"]")
	public WebElement Dazn_account_newuserpaymentPage_Gift_Code_Textbox;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"PaymentGiftCodeView\")]//button")
	public WebElement Dazn_account_newuserpaymentPage_Gift_Code_Apply_Button;
	@LinkType()
	@FindBy(xpath = "//a[contains(@href, 'gift-code')]")
	public WebElement Dazn_account_newuserpaymentPage_Gift_Code_Where_To_Buy_a_Gift_Code_Link;
	@ButtonType()
	@FindBy(xpath = "//form[contains(@class, \"DirectDebitFormView\")]//button")
	public WebElement Dazn_newuserpaymentPage_STARTSUBSCRIPTI;
	@ChoiceListType(values = { @ChoiceListValue(value = "0", title = "Month"),
			@ChoiceListValue(value = "1", title = "01"), @ChoiceListValue(value = "2", title = "02"),
			@ChoiceListValue(value = "3", title = "03"), @ChoiceListValue(value = "4", title = "04"),
			@ChoiceListValue(value = "5", title = "05"), @ChoiceListValue(value = "6", title = "06"),
			@ChoiceListValue(value = "7", title = "07"), @ChoiceListValue(value = "8", title = "08"),
			@ChoiceListValue(value = "9", title = "09"), @ChoiceListValue(value = "10"), @ChoiceListValue(value = "11"),
			@ChoiceListValue(value = "12") })
	@FindBy(xpath = "//fieldset/div[1]/div[2]/select")
	public WebElement Dazn_newuserpaymentPage_Credit___Debit_Card_EXPIRY_DATE_Month_Dropdown1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'Hint error')]/div/span")
	public WebElement Dazn_newuserpaymentPage_Gift_code_ErrorMessage;
	@TextType()
	@FindBy(xpath = "//form[contains(@class, \"CreditCardFormView\")]/button/span[2]")
	public WebElement Dazn_newuserpaymentPage_Credit___Debit_Card_START_SUBSCRIPTION_Button;
	@ButtonType()
	@FindByLabel(label = "CONTINUE")
	public WebElement Dazn_CancelSubscription_continue_Banner;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"buttonWrapper\")]/div[1]/button")
	public WebElement Dazn_account_newuserpaymentpage_Gift_Code_OK_Button;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"FreeTrialPaymentView\")]/button")
	public WebElement Dazn_account_newuserpaymentpage_GiftCode_Skip_Button;
	@TextType()
	@FindBy(xpath = "//form[contains(@class, \"CreditCardFormView\")]/div[3]/div[2]/input")
	public WebElement Dazn_newuserpaymentpage_ZipCode;
	@ButtonType()
	@FindBy(xpath = "//*[contains(@id,'app')]/div/div[1]/div[1]/div/div[2]/div[1]/button")
	public WebElement Dazn_CancelSubscription_continue_Banner_montlhysub;		

}
