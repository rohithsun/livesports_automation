package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Zuora_CustomerAccounts_CustomerView"                                
     , summary=""
     , relativeUrl=""
     , connection="Zuora"
     )             
public class Zuora_CustomerAccounts_CustomerView {

	@TextType()
	@FindBy(xpath = "//*[@id=\"basicInfo_view\"]/div[2]/div/div[1]/h2")
	public WebElement Zuora_CustomerAccounts_CustomerView_Basic_Label;
	@TextType()
	@FindBy(xpath = "//span[@id='accountName']")
	public WebElement Zuora_CustomerAccount_CustomerView_name;
	@TextType()
	@FindBy(xpath = "//table[@id='basicInfo_table']/tbody/tr[10]/td/span")
	public WebElement Zuora_CustomerAccounts_CustomerView_DaznId;
	@TextType()
	@FindBy(xpath = "//span[@id='defaultPaymentMethod']")
	public WebElement Zuora_CustomerAccounts_CustomerView_Default_Payment;
}
