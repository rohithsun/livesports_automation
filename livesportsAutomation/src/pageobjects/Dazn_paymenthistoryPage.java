package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_paymenthistoryPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_paymenthistoryPage {

	@TextType()
	@FindBy(xpath = "//th[contains(@class, 'paddingLeft')]/div")
	public WebElement Dazn_paymenthistoryPage_Date_Assert;
	@TextType()
	@FindBy(xpath = "//table[contains(@class,'table')]/tbody/tr/th[3]/div[text()]")
	public WebElement Dazn_paymenthistoryPage_Type_Assert;
	@TextType()
	@FindBy(xpath = "//table[contains(@class,'table')]/tbody/tr/th[4]/div/div[text()]")
	public WebElement Dazn_paymenthistoryPage_Payment_Method_Assert;
	@TextType()
	@FindBy(xpath = "//tbody/tr[2]/th/div/div[2]/div[1]/div/span")
	public WebElement Dazn_paymenthistoryPage_GCPayment_Method_Assert;
	@TextType()
	@FindBy(xpath = "//tr[1]/th[1]/div")
	public WebElement Dazn_paymenthistoryPage_GCDate_Assert;
	@TextType()
	@FindBy(xpath = "//h4")
	public WebElement Dazn_paymenthistoryPage_PaymentHistory_Label;		
	@TextType()
	@FindBy(xpath = "//table[contains(@class,'table')]/tbody/tr/th[5]/div[text()]")
	public WebElement Dazn_paymenthistoryPage_Subtotal;
	@TextType()
	@FindBy(xpath = "//th[6]//div")
	public WebElement Dazn_PaymentHistory_Page_Total;
	@LinkType()
	@FindBy(linkText = "Download")
	public WebElement Dazn_paymentHistoryPage_DownloadInvoice;
	@TextType()
	@FindBy(xpath = "//table//tbody//th[@class='paddingLeft']/div")
	public WebElement Dazn_paymentHistoryPage_Date_Value;
	@TextType()
	@FindBy(xpath = "//table//tbody/tr/th[3]/div")
	public WebElement Dazn_PaymentHistory_PaymentType_Value;
		@TextType()
	@FindBy(xpath = "//table//tbody/tr/th[4]/div")
	public WebElement Dazn_PaymentHistory_PaymentMethod_Value;
	@TextType()
	@FindBy(xpath = "//th[8]/div")
	public WebElement Dazn_PaymenthistoryPage_Invoice_Download;
}
