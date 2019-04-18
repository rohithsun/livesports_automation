package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Case Actions"                                
               , summary=""
               , page="CaseActions"
               , namespacePrefix=""
               , object="Case"
               , connection="SalesforceOrg"
     )             
public class CaseActions {

	@ChoiceListType()
	@VisualforceBy(componentXPath = "apex:selectList[@id='select_Action']")
	public WebElement SF_Console_CasePage_Select_CaseAction;
	@VisualforceBy(componentXPath = "apex:inputfield[@value = \"{!sCase.Case_Action_Reason__c}\"]")
	@SalesforceField(name = "Case_Action_Reason__c", object = "Case")
	public WebElement SF_Console_CasePage_CaseAction_reason;
	@TextType()
	@VisualforceBy(componentXPath = "apex:inputTextarea[@id='response']")
	public WebElement SF_Console_CasePage_CaseAction_response;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!saveAndReturn}']")
	public WebElement SF_Console_CasePage_CaseAction_execute_Btn;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!cancelAction}']")
	public WebElement SF_Console_CasePage_CaseAction_cancel_Btn;
	
}
