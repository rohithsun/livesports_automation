package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_changepaymethodPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_changepaymethodPage {

	@TextType()
	@FindBy(xpath = "//*[@id=\"liCreditCard\"]/div[2]/span")
	public WebElement Dazn_changepaymentmethodPage_Credit_Card_Click;
	@TextType()
	@FindBy(xpath = "//input[contains(@id, 'idCCHolderName')]")
	public WebElement Dazn_changepaymentmethodPage_Credit_Card_Name_On_Card_Textbox;
	@TextType()
	@FindBy(xpath = "//input[contains(@id, 'idCCCardNumber')]")
	public WebElement Dazn_changepaymentmethodPage_Credit_Card_Card_Number_Textbox;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'Monthpicker')]/button/span[1]")
	public WebElement Dazn_changepaymentmethodPage_Credit_Card_Expiry_Date_Month;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'YearPicker')]/button/span[1]")
	public WebElement Dazn_changepaymentmethodPage_Credit_Card_Expiry_Date_Month1;
	@TextType()
	@FindBy(xpath = "//input[contains(@id, 'idCCCVC')]")
	public WebElement Dazn_changepaymentmethodPage_Security_Code_Textbox;
	@ButtonType()
	@FindBy(xpath = "//input[contains(@id, 'theSaveCCChanges')]")
	public WebElement Dazn_changepaymentmethodPage_Credit_Card_Save_Button;
	@TextType()
	@FindBy(xpath = "//input[contains(@id, 'idDDAccountName')]")
	public WebElement Dazn_changepaymentmethodPage_Direct_Debit;
	@TextType()
	@FindBy(xpath = "//input[contains(@id, 'idDDAccountNumber')]")
	public WebElement Dazn_changepaymentmethodPage_Direct_Debit_IBAN;
	@ButtonType()
	@FindBy(xpath = "//input[contains(@id, 'theSaveDDChanges')]")
	public WebElement Dazn_changepaymentmethodPage_Direct_Debit_Save;
	@TextType()
	@FindBy(xpath = "//*[@id=\"liPaypal\"]/div[2]/span")
	public WebElement Dazn_changepaymentmethodPage_Paypal_Click;
	@LinkType()
	@FindBy(xpath = "//div[contains(@id, 'directDebitButton')]/span[2]/a")
	public WebElement Dazn_changepaymentmethodPage_Direct_Debit_Cancel_Link;
	@TextType()
	@FindBy(xpath = "//a[contains(@id, 'ContinueToPaypalButton')]")
	public WebElement Dazn_changepaymentmethodPage_Paypal_Continue_to_Paypal_Button;
	@TextType()
	@FindBy(xpath = "//img[contains(@src,'/resource/')]")
	public WebElement Dazn_changepaymentmethodPage_Paypal_Continue_to_Paypal_Button1;
	
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"giftcode\")]")
	public WebElement Dazn_ChangePaymentPage_AddGiftCode;
	@TextType()
	@FindBy(xpath = "//span[@id='ddAccountNameValidation']")
	public WebElement Dazn_ChangePaymentPage_InavlidMessage_DC;
	@TextType()
	@FindBy(xpath = "//span[@id='ddAccNumberValidation']")
	public WebElement Dazn_ChangePaymentmethodPage_Error_invalid_IBAN_number;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"monthDropdown\"]/following::li[4]/a")
	public WebElement Dazn_ChangePaymentPage_Credit_Card_ExpiryYear_select;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"monthDropdown\"]/div/div/div/ul/li[11]/a")
	public WebElement Dazn_chnagePaymethodPage_ExpiryDate_Month_CC;
	@TextType()
	@FindBy(xpath = "//span[@id='ccCardHolderNameValidation']")
	public WebElement Dazn_changePaymethodPage_Name_Validation;
	@TextType()
	@FindBy(xpath = "//span[@id='ccCardNumberValidation']")
	public WebElement Dazn_changepaymentmethodPage_Credit_Card_Card_Validation;
	@TextType()
	@FindBy(xpath = "//span[@id='ccCVCValidation']")
	public WebElement Dazn_changemethodPage_SecurityCode_Validation;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"monthDropdown\"]/div/div/div/ul/li[9]/a")
	public WebElement Dazn_changemethodPage_Invalid_Month;
	@TextType()
	@FindBy(xpath = "//input[@id='idCCZipCodeInput']")
	public WebElement Dazn_changepaymentPage_ZipCode_US;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'selectYearPicker')]//ul//li[22]/a/span")
	public WebElement Dazn_changepaymethodPage_Lastyear;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'selectYearPicker')]//ul/li[2]/a/span")
	public WebElement Dazn_changepaymethodPage_FirstYear_CC;
		@ButtonType()
	@FindBy(xpath = "//button[@data-id='idCCMonth']//span[@class='bs-caret']/i")
	public WebElement Dazn_ChangepaymethodPage_Date_DropDown;
}
