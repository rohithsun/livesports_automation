package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_homePage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_homePage {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'Logo')]")
	public WebElement Dazn_homePage_DAZN_Logo_Click;
	/*@TextType()
	@FindBy(xpath = "//span[text() = 'MENU']")
	public WebElement Dazn_homePage_Menu_Dropdown;*/
	@TextType()
	@FindBy(xpath = "//div[@class='MenuButton']/descendant::span[text()] ")
	public WebElement Dazn_homePage_Menu_Dropdown;
	@TextType()
	@FindBy(xpath = "//a[normalize-space(.)='MENU']")
	public WebElement Dazn_homePage_Menu_Dropdown_DE;
	@LinkType()
	@FindBy(xpath = "//li[contains(@class, \"itemHome\")]//a")
	public WebElement Dazn_homePage_Menu_Dropdown_Home_Button;
	@LinkType()
	@FindBy(xpath = "//li[contains(@class, \"itemSettings\")]//a")
	public WebElement Dazn_homePage_Menu_Dropdown_Settings_Button;
	@LinkType()
	@FindBy(xpath = "//li[contains(@class, \"itemMyAccount\")]//a") 
	public WebElement Dazn_homePage_Menu_Dropdown_My_Account_Button;
	@LinkType()
	@FindBy(xpath = "//*[@id='root']/div/div/div[1]/div/div[2]/ul/li[1]/ul/li[2]/a") 
	public WebElement Dazn_homePage_Menu_Dropdown_My_Account_Button_DE;
	@LinkType()
	@FindBy(xpath = "//li[contains(@class, \"itemHelp\")]//a")
	public WebElement Dazn_homePage_Menu_Dropdown_Help_Button;
	@LinkType()
	@FindBy(xpath = "//li[contains(@class, \"itemSignOut\")]//a")
	public WebElement Dazn_homePage_Menu_Dropdown_Sign_Out_Button;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'Dropdown revealed reveal')]/ul/li[8]//a")
	public WebElement Dazn_homePage_Menu_Dropdown_About_Button;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'Dropdown revealed reveal')]/ul/li[9]//a")
	public WebElement Dazn_homePage_Menu_Dropdown_Privacy_Policy_Button;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'Dropdown revealed reveal')]/ul/li[10]//a")
	public WebElement Dazn_homePage_Menu_Dropdown_Terms_Button;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"content\")]//div[2]")
	public WebElement Dazn_homePage_Search_Icon;
	
	@TextType()
       @FindBy(xpath = "//div[@class='submit primary']//span[@class='buttonText']")
       public WebElement Dazn_homePage_Visible_ForUser_Canada;
			
}
