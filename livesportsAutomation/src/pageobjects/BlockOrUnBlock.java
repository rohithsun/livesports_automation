package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="BlockOrUnBlock"                                
               , summary=""
               , connection="SalesforceOrg"
               , lightningComponent="BlockOrUnBlock"
               , namespacePrefix=""
     )             
public class BlockOrUnBlock {

	@ButtonType()
	@AuraBy(componentXPath = "//force:modal//lightning:button[@label= 'Cancel']")
	public WebElement cancel;
	@ButtonType()
	@AuraBy(componentXPath = "//force:modal//lightning:button[@label= 'Submit']")
	public WebElement submit;
	
}
