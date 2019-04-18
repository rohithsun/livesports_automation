package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Casecomment"                                
               , summary=""
               , page="CaseComment"
               , namespacePrefix=""
               , object="case"
               , connection="SalesforceOrg"
     )             
public class casecomment {

	@TextType()
	@VisualforceBy(componentXPath = "apex:pageBlockSectionItem[1]/apex:outputField[@id='actNumber']")
	public WebElement SF_Console_CasePage_CaseCommentEditPage_Subject;
	@TextType()
	@VisualforceBy(componentXPath = "apex:pageBlockSectionItem[2]/apex:outputField[@id='actNumber']")
	public WebElement SF_Console_CasePage_CaseCommentEditPage_Desc;
	@BooleanType()
	@VisualforceBy(componentXPath = "apex:inputCheckbox[@value = \"{!cComment.IsPublished}\"]")
	public WebElement SF_Console_CasePage_CaseCommentEditPage_Public_Checkbox;
	@TextType()
	@VisualforceBy(componentXPath = "apex:inputTextarea[@id='newDesc']")
	public WebElement SF_Console_CasePage_CaseCommentEditPage_commentTextArea;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!saveRecord}']")
	public WebElement SF_Console_CasePage_CaseCommentEditPage_Save_Btn;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!cancelRecord}']")
	public WebElement SF_Console_CasePage_CaseCommentEditPage_Cancel_Btn;
	
}
