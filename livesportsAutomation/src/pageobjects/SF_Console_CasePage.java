package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="SF_ Console_ Case Page"                                
               , summary=""
               , page="CasePage"
               , namespacePrefix=""
               , object="Case"
               , connection="SalesforceOrg"
     )             
public class SF_Console_CasePage {

	@TextType()
	@FindBy(xpath = "//div[contains(@id,'casePage:frm:pb')]//label[text()='Case Owner']/following::td[1]")
	public WebElement SF_Console_CasePage_CaseDetail_CaseOwner;
	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'Parent_ilecell')]")
	public WebElement SF_Console_CasePage_CaseDetail_ParentCase;
	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'ContactEmail')]")
	public WebElement SF_Console_CasePage_CaseDetail_ContactEmail;
	@TextType()
	@FindBy(xpath = "//div[contains(@id,'casePage:frm:pb')]//label[text()='Case Number']/following::td[1]")
	public WebElement SF_Console_CasePage_CaseDetail_CaseNumber;
	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'NotificationCountryCode')]")
	public WebElement SF_Console_CasePage_CaseDetail_NotificationCountryCode;
	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'NotificationLanguageCode')]")
	public WebElement SF_Console_CasePage_CaseDetail_NotificationLanguageCode;
	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'Status')]")
	public WebElement SF_Console_CasePage_AddInfo_Status;
	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'CaseOrigin_ileinner')]")
	public WebElement SF_Console_CasePage_AddInfo_CaseOrigin;
	@ChoiceListType()
	@FindBy(xpath = "//select[@onchange='typeSelected();']")
	public WebElement SF_Console_CasePage_AddInfo_Type;
	@ChoiceListType()
	@FindBy(xpath = "//select[@onchange='subtypeSelected();']")
	public WebElement SF_Console_CasePage_AddInfo_Sub_Type;
	@ChoiceListType()
	@FindBy(xpath = "//select[@onchange='subtype2Selected();']")
	public WebElement SF_Console_CasePage_AddInfo_End_Type;
	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'Subject_ileinner')]")
	public WebElement SF_Console_CasePage_DescInfo_Subject;
	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'WebEmail')]")
	public WebElement SF_Console_CasePage_DescInfo_WebEmail;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@id='takeButton']")
	public WebElement SF_Console_CasePage_TakeOwnership;
	@TextType()
	@FindBy(xpath = "//tr[contains(@class, \"dataRow\")]//td[5]")
	public WebElement SF_Console_CasePage_StatusOwnerCaptures_CurrentStatus;
	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'Description_ileinner')]")
	public WebElement SF_Console_CasePage_DescInfo_description;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@id='actionsButton']")
	public WebElement SF_Console_CasePage_CaseActions_Btn;
	@ButtonType()
	@FindByLabel(label = "New")
	public WebElement SF_Console_CasePage_CaseComment_New_btn;
	@BooleanType()
	@FindBy(xpath = "//img[@src=\"/img/checkbox_checked.gif\"]")
	public WebElement SF_Console_CasePage_CaseComment_Table_PublicChecked;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:pageBlockButtons[@id='pageBlockButtons']")
	public WebElement SF_Console_CasePage_Emails_SendAnEmail_Btn;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@id='assignButton']")
	public WebElement SF_Console_CasePage_AssignCountryAndLanguage_Btn;
	@LinkType()
	@FindBy(linkText = "AutoProv VA AutoProv VT")
	public WebElement SF_Console_CasePage_ContactName;
	@TextType()
	@FindBy(xpath = "//tr[contains(@class, \"dataRow\")]//td[3]")
	public WebElement SF_ConsolePage_StatusOwnerCaptures_EntryTime;
	@TextType()
	@FindBy(xpath = "//tr[contains(@class, \"dataRow\")]//td[7]")
	public WebElement SF_ConsolePage_StatusOwnerCaptures_TotalTime;
	@TextType()
	@FindBy(xpath = "//tr[contains(@class, \"dataRow\")]//td[8]")
	public WebElement SF_ConsolePage_StatusOwnerCaptures_Type;
	@TextType()
	@FindBy(xpath = "//tr[contains(@class, \"dataRow\")]//td[9]")
	public WebElement SF_ConsolePage_StatusOwnerCaptures_Owner;
	@TextType()
	@FindBy(xpath = "//table[contains(@class, \"list\")]/tbody/tr[3]//td[2]")
	public WebElement SF_ConsolePage_StatusOwnerCaptures_Action;
	@TextType()
	@FindBy(xpath = "//span[contains(@id, 'casePage_frm_casecId') and @class='inlineEditWrite']")
	public WebElement SF_Console_CasePage_CaseComments_Comment;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"caseBlock\")]/div/div[2]/table/tbody/tr[2]//td[2]")
	public WebElement SF_Console_CasePage_ParentCase_Closed_Label;
	
}
