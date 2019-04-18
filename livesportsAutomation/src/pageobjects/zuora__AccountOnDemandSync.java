package pageobjects;

import org.openqa.selenium.WebElement;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.SalesforcePage;
import com.provar.core.testapi.annotations.TextType;
import com.provar.core.testapi.annotations.VisualforceBy;

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
