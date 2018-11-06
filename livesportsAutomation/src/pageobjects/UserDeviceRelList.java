package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="User Device Rel List"                                
               , summary=""
               , page="UserDeviceRelList"
               , namespacePrefix=""
               , object="Account"
               , connection="SalesforceOrg"
     )             
public class UserDeviceRelList {

	@PageTable(row = UserDevices.class)
	@VisualforceBy(componentXPath = "apex:pageBlockTable[@value = \"{!userDevices}\"]")
	public List<UserDevices> UserDevices;

	@PageRow(byColumn = true)
	public static class UserDevices {

		@TextType()
		@FindByLabel(label = "Device Type")
		public WebElement Device_Type;
		@TextType()
		@VisualforceBy(componentXPath = "apex:column[2]")
		public WebElement deviceType;
		@TextType()
		@FindByLabel(label = "Registration Date")
		public WebElement registrationDate;
		@TextType()
		@VisualforceBy(componentXPath = "apex:column[3]")
		public WebElement registrationDate1;
	}
	
}
