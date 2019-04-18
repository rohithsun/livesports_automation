package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.Page;

@Page( title="Dazn_SignInSelector_Japan"                                
     , summary=""
     , relativeUrl=""
     , connection="daznmylogin"
     )             
public class Dazn_SignInSelector_Japan {

	@ButtonType()
	@FindBy(xpath = "//button[contains(@class,'daznSignin')]//span[@class='wrapper']")
	public WebElement Dazn_SignInSelector_Japan_button;
			
}
