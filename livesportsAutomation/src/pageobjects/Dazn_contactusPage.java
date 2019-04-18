package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_contactusPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_contactusPage {

	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'providerText')]")
	public WebElement Dazn_contactusPage_DO_YOU_HAVE_A_DAZN_ACCOUNT;
	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'caseTypeText')]")
	public WebElement Dazn_contactusPage_Please_select_a_subject_Dropdown;
	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'caseSubTypeText')]")
	public WebElement Dazn_contactusPage_PLEASE_SELECT_A_TOPIC_Dropdown;
	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'caseSubType2Text')]")
	public WebElement Dazn_contactusPage_PLEASE_SELECT_YOUR_QUERY;
	@TextType()
	@FindBy(xpath = "//input[contains(@id, 'contactUsFrm:emailAddress')]")
	public WebElement Dazn_contactusPage_EMAIL_ADDRESS;
	@TextType()
	@FindBy(xpath = "//textarea[contains(@id, 'contactUsFrm:comment')]")
	public WebElement Dazn_contactusPage_DESCRIBE_YOUR_ISSUE;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id, 'contactUsFrm:sendButton')]")
	public WebElement Dazn_contactusPage_SEND;
	@TextType()
	@FindBy(xpath = "//*[@id=\"custom-provider-dropdown\"]/div")
	public WebElement contactUsFrm;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'d52:1:idOtherRow')]//div")
	public WebElement Dazn_ContactusPage_DropdownValue;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'id58:0:idRow1')]//div")
	public WebElement Dazn_contactusPage_PLEASE_SELECT_A_TOPIC_Dropdown_Value;
	@TextType()
	@FindBy(xpath = "//span[contains(@id,'_id64:0:idRow1')]//div")
	public WebElement Dazn_contactusPage_Please_select_Query_Value;
	@LinkType()
    @FindBy(xpath = "//a[contains(@class,'okBtn')]")
    public WebElement Dazn_myaccountPage_ChangePayment_somethingwentWrong_button;
	@LinkType()
	@FindBy(xpath = "//a[@class= \"cancelLink\"]")
	public WebElement Dazn_contactusPage_BackToHelp_link;
	@LinkType()
	@FindBy(xpath = "//a[@class= \"backToHome\"]")
	public WebElement Dazn_contactusPage_BacktoHome_Link;
	@TextType()
	@FindBy(xpath = "//div[@id='resolutionText']")
	public WebElement Dazn_contactusPage_Subject_Error_Docomo;
	@TextType()
	@FindBy(xpath = "//li[@name='Comment about marketing or adverts']")
	public WebElement Dazn_contactisPage_Topic_Value;
	@TextType()
	@FindBy(xpath = "//li[@name='Comment about a current marketing campaign']")
	public WebElement Dazn_contactusPage_Query_Value;		
	
	@TextType()
	@FindBy(xpath = "//input[contains(@id,'contactUsFrm:emailAddress')]")
	public WebElement Dazn_contactusPage_Email_Value;
	
	
	
	@TextType()
	@FindBy(xpath = "//li[@id='DAZN for docomo']/div")
	public WebElement Dazn_ContactUsPage_Dazn_For_Docomo;
	@TextType()
	@FindBy(xpath = "//li[@id='New to DAZN?']/div")
	public WebElement Dazn_ContactUsPage_Dazn_For_NewUser;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id,'docomoSignInButton')]/span[2]/span")
	public WebElement Dazn_contactusPage_docomoSignInButton;
	@TextType()
	@FindBy(id = "emailvalidation")
	public WebElement Dazn_ContactUsPage_emailErrMsg;
}
