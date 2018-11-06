package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DAZNPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class DAZNPage {

	
	@PageWait.Field(timeoutSeconds = 15)
	@FindBy(xpath = "//button[@class='ButtonBase Button start chevron']")
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
	@FindBy(xpath = "//p[1]//a")
	public WebElement SignIn_HomeLink;
	@TextType()
	@FindBy(name = "repeatEmail")
	public WebElement Re_Enter_EmailAdd;
			
}
