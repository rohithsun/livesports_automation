package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="SF_AccountLightning"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesforceOrg"
     )             
public class SF_AccountLightning {

	@TextType()
	@FindBy(xpath = "//input[@name='Account-search-input']")
	public WebElement searchThisList;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='App Launcher']")
	public WebElement appLauncher;
	@TextType()
	@FindBy(xpath = "//h2[normalize-space(.)='App LauncherSearch apps or items...Clear searchVisit AppExchange']//input")
	public WebElement searchAppsOrItems;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Accounts']")
	public WebElement accounts;
	@TextType()
	@FindBy(xpath = "//button[normalize-space(.)='App Launcher']/div/div/div")
	public WebElement appLauncher1;
			
}
