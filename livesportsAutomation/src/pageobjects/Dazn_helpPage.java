package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Dazn_helpPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_helpPage {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class, 'help')]/a")
	public WebElement Dazn_helpPage_HELP_Lable;
	@LinkType()
	@FindBy(xpath = "//span[contains(@class, 'contactusLink')]")
	public WebElement Danz_helpPage_ContactUs_Link;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'seeAllFaq')]")
	public WebElement Dazn_helpPage_SeeAll_1_FAQS;
	@LinkType()
	@FindBy(xpath = "//a[@class='helpDocomoLink']")
	public WebElement Dazn_helpPage_Dazn_For_Docomo;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"backToHome\")]")
	public WebElement DAZN_helpPage_BacktoHome;
	@LinkType()
	@FindBy(xpath = "//a[@id='changelang']")
	public WebElement Dazn_helpPage_Langugae_link;
	@LinkType()
	@FindBy(xpath = "//a[contains(@class, \"logo\")]")
	public WebElement Dazn_helpPage_Dazn_Logo;
	@TextType()
	@FindBy(xpath = "//input[@type='text']")
	public WebElement Dazn_HelpPage_HowCanWeHelp_TextBox;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'suggetionStyle')]")
	public WebElement Dazn_helpPage_SugesstionsLabel;
	@TextType()
	@FindBy(xpath = "//span[contains(@class,'searchBox')]")
	public WebElement Dazn_HelpPage_SearchIcon;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'sectionDataHead')]//a[contains(@href,'Getting-Started')]")
	public WebElement Dazn_HelpPage_GettingStarted;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'sectionDataHead')]//a[contains(@href,'Troubleshooting')]")
	public WebElement Dazn_helpPage_TroubleShooting;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'sectionDataHead')]//a[contains(@href,'App')]")
	public WebElement Dazn_HelpPage_Content_App_Functionality;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'sectionDataHead')]//a[contains(@href,'Account')]")
	public WebElement Dazn_HelpPage_Account_and_Payment;
	@TextType()
	@FindBy(xpath = "//li[@class='firstChild']")
	public WebElement Dazn_helpPage_Language_Selected;
	@LinkType()
	@FindBy(xpath = "//a[contains(@href,'Started')]/following::div[@class='linkSection'][1]/a[contains(@href,'Test-Knowledge')]")
	public WebElement Dazn_helpPage_GettingStarted_Article;
	@LinkType()
	@FindBy(xpath = "//a[contains(@href,'Issues')]/following::div[@class='linkSection'][1]/a[contains(@href,'Testing')]")
	public WebElement Dazn_HelpPage_TroubleShooting_Article;
	@LinkType()
	@FindBy(xpath = "//a[contains(@href,'App')]/following::div[@class='linkSection'][1]/a[contains(@href,'Test')]")
	public WebElement Dazn_helpPage_Content_App_Article;
	@LinkType()
	@FindBy(xpath = "//a[contains(@href,'Payment')]/following::div[@class='linkSection'][1]/a[contains(@href,'vidya')]")
	public WebElement Dazn_helpPage_Account_and_payment_Artilce;
	@LinkType()
	@FindBy(xpath = "//span[contains(@id,'ClickableLang')]/li/a")
	public WebElement Dazn_helpPage_ChangingLang_Non_Selected;
	@LinkType()
	@FindBy(xpath = "//div[contains(@ng-repeat,'lstAllFilteredArticles')][1]/div[@class='spanLinkUpdated']/a")
	public WebElement Dazn_helpPage_Suggestions_Articles;
	@TextType()
	@FindBy(xpath = "//span[contains(@ng-show,'AllFilteredArti') and @class='noArticle']")
	public WebElement Dazn_helpPage_NoArticlesFound;		
}
