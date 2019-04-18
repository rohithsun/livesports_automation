package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.Page;

@Page( title="Dazn_PausedUser_Page"                                
     , summary=""
     , relativeUrl=""
     , connection="daznmylogin"
     )             
public class Dazn_PausedUser_Page {

	@ButtonType()
	@FindBy(xpath = "//div[@class='submit button']/button")
	public WebElement Dazn_PausedUser_RestartPage;
			
}
