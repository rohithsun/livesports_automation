package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.PageWait;
import com.provar.core.testapi.annotations.TextType;

@Page( title="DAZNPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class DAZNPage {

	
	@PageWait.Field(timeoutSeconds = 15)
	@FindBy(xpath = "//a[contains(@href,'signup')]/span")
	@ButtonType()
	public WebElement startYourFreeMonthNow;
	@PageWait.Field(timeoutSeconds = 10)
	@FindBy(xpath = "//input[@name=\"firstName\"]")
	@TextType()
	public WebElement FirstName;
	@FindBy(xpath = "//input[@name=\"lastName\"]")
	@TextType()
	public WebElement LastName;
	@TextType()
	@FindBy(xpath = "//input[@name=\"email\"]")
	public WebElement Email;
	@TextType()
	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement Password;
	@TextType()
	@FindBy(xpath = "//input[@name=\"repeatPassword\"]")
	public WebElement ReEnterPassword;
	
	@TextType()
	@FindBy(xpath = "//div[@class='wrapper']/input[@type='checkbox']")
	public WebElement SendEmailCheckbox;
	@FindBy(xpath = "//div[@class='signup button']/button[@type='submit']")
	@ButtonType()
	public WebElement Continue_Signup;
	@TextType()
	@FindBy(xpath = "//li[contains(@class, 'LanguageLink')]/span[text()='English']")
	public WebElement change_language_en_it;
	@TextType()
	@FindBy(xpath = "//li[contains(@class, 'LanguageLink')]/span[text()='it']")
	public WebElement change_language_it_IT;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"MenuButton\")]")
	public WebElement Click_on_Menu;
	@LinkType()
	@FindBy(xpath = "//li[contains(@class, \"itemSignOut\")]//a")
	public WebElement signOut_menu;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, \"buttonWrapper\")]/div[1]/button")
	public WebElement Confirm_SIGNOUT;
	@LinkType()
	@FindBy(xpath = "//a[contains(@href,'signin')]")
	public WebElement SignIn_HomeLink;
	@TextType()
	@FindBy(name = "emailConfirmation")
	public WebElement Re_Enter_EmailAdd;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"submit\")]/button//span[2]")
	public WebElement Dazn_accountSignInPage_OK_Banner;
	@TextType()
	@FindBy(xpath = "//div[@class='submit primary']//span[@class='buttonText']")
	public WebElement DAZNPage_Visible_for_Users;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='MENU']")
	public WebElement Click_on_Menu_DE;
	@LinkType()
	@FindBy(linkText = "Sign Out")
	public WebElement signOut_menu_DE;
	@ButtonType()
	@FindByLabel(label = "SIGN OUT")
	public WebElement Confirm_SIGNOUT_DE; 
}
