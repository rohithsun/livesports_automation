package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Zuora"                                
     , summary=""
     , relativeUrl=""
     , connection="Zuora"
     )             
public class Zuora {

	@TextType()
	@FindBy(xpath = "//input[@name=\"username\"]")
	public WebElement UserName;
	@TextType()
	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement password;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"btn-login\")]")
	public WebElement login;
	@TextType()
	@FindBy(xpath = "//form[@name='searchForm']/div/input[@name='search_input_name']")
	public WebElement SearchAccount;
	@LinkType()
	@FindBy(xpath = "//form[@name='searchForm']/div/a/span[@id='SearchButton']")
	public WebElement SearchButton;
	@LinkType()
	@FindBy(xpath = "//*[@id='Zuora/Customers/CustomerAccounts']")
	public WebElement customerAccounts;
	
	@PageTable(firstRowContainsHeaders = true, row = SearchResult.class)
	@FindBy(xpath = "(//div[@id='Search_Result1']/table/tbody/tr/td/div/table/tbody/tr)[2]/td")
	public List<SearchResult> SearchResult;

	@PageRow()

	public static class SearchResult{
		@TextType()
		@FindBy(xpath = ".")
		public WebElement SearchResultOption;
		@LinkType()
		@FindBy(linkText = "AutoProvar en ITAP POC en ITAT")
		public WebElement customerName;
	
	 }
	 
	@PageTable(firstRowContainsHeaders = true, row = BasicInformation.class)
	@FindBy(xpath = "//div[@class='z-table-block z-basic']/table[@id='basicInfo_table']/tbody/tr")
	public List<BasicInformation> BasicInformation;

	@PageRow()
	public static class BasicInformation{
		@TextType()
		@FindBy(xpath = ".//td/span")
		public WebElement BasicInformationValue;
	
	 }
	 
	@PageTable(firstRowContainsHeaders = false, row = SubscriptionInformation.class)
	@FindBy(xpath = "(//div[@class='z-table-block z-standard']/table[@id='subsciptions']/tbody/tr)[2]")
	public List<SubscriptionInformation> SubscriptionInformation;

	@PageRow()
	public static class SubscriptionInformation{
		@TextType()
		@FindBy(xpath = ".//td[1]/div/a[2]")
		public WebElement SubscriptionInformationValue;
		
		@TextType()
		@FindBy(xpath = ".//td[2]/div")
		public WebElement SubscriptionCMRR;
		
		@TextType()
		@FindBy(xpath = ".//td[4]/div")
		public WebElement SubscriptionContractEffectiveDate;
		
		@TextType()
		@FindBy(xpath = ".//td[6]/div")
		public WebElement SubscriptionStatus;
	 }
	
	@PageTable(firstRowContainsHeaders = false, row = InvoiceInformation.class)
	@FindBy(xpath = "(//div[@class='z-table-block z-standard']/table[@id='invoices']/tbody/tr)[2]")
	public List<InvoiceInformation> InvoiceInformation;

	@PageRow()
	public static class InvoiceInformation{
		@TextType()
		@FindBy(xpath = ".//td[1]/div")
		public WebElement InvoiceDate;
		
		@TextType()
		@FindBy(xpath = ".//td[2]/div/a[2]")
		public WebElement InvoiceNumber;
		
		@TextType()
		@FindBy(xpath = ".//td[3]/div/span")
		public WebElement DueDate;
		
		@TextType()
		@FindBy(xpath = ".//td[7]/div")
		public WebElement InvoiceStatus;
	 }
	
	
	@PageTable(firstRowContainsHeaders = true, row = TransactionInformation.class)
	@FindBy(xpath = "(//div[@class='z-table-block z-basic']/table)[7]/tbody/tr")
	public List<TransactionInformation> TransactionInformation;

	@PageRow()
	public static class TransactionInformation{
		@TextType()
		@FindBy(xpath = ".//td/span")
		public WebElement TransactionInformationValue;
	
	 }

	@PageWaitAfter.Timed(durationSeconds = 10)
	@TextType()
	@FindBy(xpath = "//*[@id='CalloutOption_tabPanel']/h2/span[contains(text(),'Callout History')]")
	public WebElement CalloutHistory;
	 
	 
	@PageTable(firstRowContainsHeaders = false, row = CalloutHistoryInformation.class)
	@FindBy(xpath = "((//div[@class='z-table-block z-standard']/table[@id='calloutHistoryList']/tbody)[2]/tr)[1]")
	public List<CalloutHistoryInformation> CalloutHistoryInformation;

	@PageRow()
	public static class CalloutHistoryInformation{
		@TextType()
		@FindBy(xpath = ".//td[5]/div/span/a")
		public WebElement CalloutHistoryInformationValue;
	
	 }

	@PageWait.Field(timeoutSeconds = 10)
	@LinkType()
	@FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-2\"]/ul/li/a")
	public WebElement Zuora_UserMenu;
	@LinkType()
	@FindBy(linkText = "Logout")
	public WebElement logout_zuora;
	@TextType()
	@FindBy(xpath = "//th[contains(@class, \"noRowsHeader\")]")
	public WebElement No_Match_found;
}
