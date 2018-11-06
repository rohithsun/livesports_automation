package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Zuora__ Account On Demand Sync"                                
               , summary=""
               , page="AccountOnDemandSync"
               , namespacePrefix="Zuora"
               , object="Account"
               , connection="SalesforceOrg"
     )             
public class zuora__AccountOnDemandSync {

	@TextType()
	@VisualforceBy(componentXPath = "apex:outputPanel[@id='errorPanel']//ul/li")
	public WebElement Zuora_Sync_Request_Message;
	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!navigateBack}']")
	public WebElement Zuora_sync_back_button;
	
}
