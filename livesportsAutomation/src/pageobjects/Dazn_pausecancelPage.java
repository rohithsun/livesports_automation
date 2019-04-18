package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;

@Page( title="Dazn_pausecancelPage"                                
     , summary=""
     , relativeUrl=""
     , connection="DAZN"
     )             
public class Dazn_pausecancelPage {

	@LinkType()
	@FindBy(xpath = "//a[contains(@href, '/setpause/initiate')]")
	public WebElement Dazn_pausecancelPage_Go_Ahead___Pause;
	@LinkType()
	@FindBy(xpath = "//a[contains(@id, 'pauseUpsellForm:stay')]")
	public WebElement Dazn_pausecancelPage_No__I_want_To_Stay_Button;
	@LinkType()
	@FindBy(xpath = "//a[contains(@href, '/cancel')]")
	public WebElement Dazn_pausecancelPage;
			
}
