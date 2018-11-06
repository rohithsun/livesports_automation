package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="PaymentPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class PaymentPage {

	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'Section DirectDebit')]")
	public WebElement UI_Assert_DirectDebit;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'Section CreditCard')]")
	public WebElement UI_Assert_CreditCard;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'Section PayPal')]")
	public WebElement UI_Assert_PayPal;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'Section GiftCode')]")
	public WebElement UI_Assert_GiftCode;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'Section CreditCard')]//div[contains(@class, 'ls_icon_arrow_small')]")
	public WebElement Click_Credit_card;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'Section DirectDebit')]//div[contains(@class, 'ls_icon_arrow_small')]")
	public WebElement Click_Direct_Debit;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'Section PayPal')]//div[contains(@class, 'ls_icon_arrow_small')]")
	public WebElement Click_Paypal;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'Section GiftCode')]//div[contains(@class, 'ls_icon_arrow_small')]")
	public WebElement Click_GiftCode;
	@TextType()
	@FindBy(xpath = "//input[@name=\"cardNumber\"]")
	public WebElement CardNumber;
	@ChoiceListType(values = { @ChoiceListValue(value = "0", title = "Month"), @ChoiceListValue(value = "1", title = "01"), @ChoiceListValue(value = "2", title = "02"), @ChoiceListValue(value = "3", title = "03"), @ChoiceListValue(value = "4", title = "04"), @ChoiceListValue(value = "5", title = "05"), @ChoiceListValue(value = "6", title = "06"), @ChoiceListValue(value = "7", title = "07"), @ChoiceListValue(value = "8", title = "08"), @ChoiceListValue(value = "9", title = "09"), @ChoiceListValue(value = "10"), @ChoiceListValue(value = "11"), @ChoiceListValue(value = "12") })
	@FindBy(xpath = "//fieldset/div[1]/div[2]/select")
	public WebElement ExpDate;
	@ChoiceListType(values = { @ChoiceListValue(value = "0", title = "Year"), @ChoiceListValue(value = "2018"), @ChoiceListValue(value = "2019"), @ChoiceListValue(value = "2020"), @ChoiceListValue(value = "2021"), @ChoiceListValue(value = "2022"), @ChoiceListValue(value = "2023"), @ChoiceListValue(value = "2024"), @ChoiceListValue(value = "2025"), @ChoiceListValue(value = "2026"), @ChoiceListValue(value = "2027") })
	@FindBy(xpath = "//fieldset/div[2]/div[2]/select")
	public WebElement ExpYear;
	@TextType()
	@FindBy(xpath = "//input[@name=\"securityCode\"]")
	public WebElement CVV;
	@ButtonType()
	@FindBy(xpath = "//form[contains(@class, \"CreditCardFormView\")]//button")
	public WebElement sTARTSUBSCRIPTIONWITHOBLIGATIONTOPAYAFTERFREETRIAL;
	@TextType()
	@FindBy(xpath = "(//div[contains(@class, 'billingDates')]/p/span)[1]")
	public WebElement AccessStarts;
	@TextType()
	@FindBy(xpath = "(//div[contains(@class, 'billingDates')]/p/span)[2]")
	public WebElement Free_trial_end_date;
	@TextType()
	@FindBy(xpath = "(//div[contains(@class, 'billingDates')]/p/span)[3]")
	public WebElement First_payment_date;
	@TextType()
	@FindBy(xpath = "(//div[contains(@class, 'billingDates')]/p/span)[4]")
	public WebElement Price;
	@TextType()
	@FindBy(xpath = "(//div[contains(@class, 'billingDates')]/p/span)[5]")
	public WebElement Payment_method_;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"ConfirmationView\")]//button")
	public WebElement startWatching;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, \"NavigationMenu\")]//a[1]")
	public WebElement HomeMenu;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, \"NavigationMenu\")]//a[2]")
	public WebElement SCHEDULETab;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"MenuButton\")]//span[1]")
	public WebElement Menu;
	@PageWait.Field(timeoutSeconds = 10)
	@ButtonType()
	@FindBy(xpath = "//button[contains(@class, \"ButtonBase\")]")
	public WebElement StartWatching_Banner;
	@TextType()
	@FindBy(css = "form.CreditCardFormView div.wrapper div.decorator")
	public WebElement Terms_of_use_checkbox;
			
}
