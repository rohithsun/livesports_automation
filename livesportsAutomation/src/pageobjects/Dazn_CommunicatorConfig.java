package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Dazn_CommunicatorConfig"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesforceOrg"
     )             
public class Dazn_CommunicatorConfig {

	@ButtonType()
	@FindByLabel(label = "Manage")
	public WebElement Dazn_CommunicatorConfig_Manage;
	@LinkType()
	@FindBy(linkText = "DispatchID_Set_Edit_Pause_Confirmation")
	public WebElement DispatchID_Set_Edit_Pause_Confirmation;
	@TextType()
	@FindBy(xpath = "//tr[48]//td[2]")
	public WebElement DispatchID_Set_Edit_Pause_Confirmation_Value;
	@LinkType()
	@FindBy(linkText = "DispatchID_Set_Edit_Pause_Confirmation")
	public WebElement dispatchIDSetEditPauseConfirmation;		
	@ButtonType()
	@FindBy(linkText = "DispatchID_EditingRestartDate_In_Pause")
	public WebElement DispatchID_EditingRestartDate_In_Pause;
	@TextType()
	@FindBy(xpath = "//tr[24]//td[2]")
	public WebElement DispatchID_EditingRestartDate_In_Pause_Value;
	@LinkType()
	@FindBy(linkText = "DispatchID_Cancelling_Scheduled_Pause")
	public WebElement DispatchID_Cancelling_Scheduled_Pause;
	@TextType()
	@FindBy(xpath = "//tr[23]//td[2]")
	public WebElement DispatchID_Cancelling_Scheduled_Pause_Value;
}
